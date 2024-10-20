package ru.isntrui.holodos.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import ru.isntrui.holodos.repositories.UserRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@Testcontainers
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    private final Gson gson = new Gson();

    @Container
    private static final PostgreSQLContainer<?> postgresContainer = new PostgreSQLContainer<>("postgres:latest")
            .withDatabaseName("testdb")
            .withUsername("user")
            .withPassword("password");

    @BeforeEach
    void setUp() {
        userRepository.deleteAll();
    }

    @Test
    void shouldCreateUser() throws Exception {
        JsonObject userJson = new JsonObject();
        userJson.addProperty("firstName", "John");
        userJson.addProperty("lastName", "Doe");
        userJson.addProperty("phone", "1234567890");
        userJson.addProperty("role", "RECEIVER");

        mockMvc.perform(post("/api/user/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(gson.toJson(userJson)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("John"));
    }

    @Test
    void shouldGetUserById() throws Exception {
        String userJson = "{\"firstName\":\"John\", \"lastName\":\"Doe\", \"phone\":\"1234567890\", \"role\":\"RECEIVER\"}";
        String response = mockMvc.perform(post("/api/user/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andReturn().getResponse().getContentAsString();

        long id = gson.fromJson(response, JsonObject.class).get("id").getAsLong();

        mockMvc.perform(get("/api/user/{id}", id))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(id));
    }

    @Test
    void shouldReturnNotFoundForNonExistingUser() throws Exception {
        mockMvc.perform(get("/api/user/999"))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    void shouldGetUserByPhone() throws Exception {
        String userJson = "{\"firstName\":\"John\", \"lastName\":\"Doe\", \"phone\":\"1234567890\", \"role\":\"RECEIVER\"}";
        mockMvc.perform(post("/api/user/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson));

        mockMvc.perform(get("/api/user/phone?phone=1234567890"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.phone").value("1234567890"));
    }

    @Test
    void shouldReturnNotFoundForNonExistingPhone() throws Exception {
        mockMvc.perform(get("/api/user/phone?phone=0000000000"))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    void shouldUpdateUser() throws Exception {
        String userJson = "{\"firstName\":\"John\", \"lastName\":\"Doe\", \"phone\":\"1234567890\", \"role\":\"RECEIVER\"}";
        String response = mockMvc.perform(post("/api/user/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andReturn().getResponse().getContentAsString();

        long id = gson.fromJson(response, JsonObject.class).get("id").getAsLong();

        JsonObject updatedUserJson = new JsonObject();
        updatedUserJson.addProperty("id", id);
        updatedUserJson.addProperty("firstName", "Jane");
        updatedUserJson.addProperty("lastName", "Doe");
        updatedUserJson.addProperty("phone", "0987654321");
        updatedUserJson.addProperty("role", "RECEIVER");

        mockMvc.perform(put("/api/user/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(gson.toJson(updatedUserJson)))
                .andExpect(MockMvcResultMatchers.status().isOk());

        mockMvc.perform(get("/api/user/{id}", id))
                .andExpect(MockMvcResultMatchers.jsonPath("$.phone").value("0987654321"));
    }
}