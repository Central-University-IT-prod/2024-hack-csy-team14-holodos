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
import ru.isntrui.holodos.repositories.HolodosRepository;
import ru.isntrui.holodos.repositories.ProductRepository;
import ru.isntrui.holodos.repositories.SkuRepository;
import ru.isntrui.holodos.repositories.UserRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@Testcontainers
@SpringBootTest
@AutoConfigureMockMvc
public class HolodosControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private HolodosRepository holodosRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SkuRepository skuRepository;

    private final Gson gson = new Gson();

    @Container
    private static final PostgreSQLContainer<?> postgresContainer = new PostgreSQLContainer<>("postgres:latest")
            .withDatabaseName("testdb")
            .withUsername("user")
            .withPassword("password");

    @BeforeEach
    void setUp() {
        holodosRepository.deleteAll();
        userRepository.deleteAll();
        productRepository.deleteAll();
        skuRepository.deleteAll();
    }

    @Test
    void shouldCreateHolodos() throws Exception {
        JsonObject holodosJson = new JsonObject();
        holodosJson.addProperty("name", "Test Holodos");

        mockMvc.perform(post("/api/holodos/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(gson.toJson(holodosJson)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Test Holodos"));
    }

    @Test
    void shouldGetHolodosById() throws Exception {
        String holodosJson = "{\"name\":\"Test Holodos\"}";
        String response = mockMvc.perform(post("/api/holodos/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(holodosJson))
                .andReturn().getResponse().getContentAsString();

        long id = gson.fromJson(response, JsonObject.class).get("id").getAsLong();

        mockMvc.perform(get("/api/holodos/{id}", id))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(id))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Test Holodos"));
    }

    @Test
    void shouldReturnNotFoundForNonExistingHolodos() throws Exception {
        mockMvc.perform(get("/api/holodos/999"))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    void shouldGetHolodosByUserId() throws Exception {
        String userJson = "{\"firstName\":\"John\", \"lastName\":\"Doe\", \"phone\":\"1234567890\", \"role\":\"RECEIVER\"}";
        String userResponse = mockMvc.perform(post("/api/user/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andReturn().getResponse().getContentAsString();

        long userId = gson.fromJson(userResponse, JsonObject.class).get("id").getAsLong();

        String holodosJson = "{\"name\":\"User's Holodos\"}";
        mockMvc.perform(post("/api/holodos/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(holodosJson));

        mockMvc.perform(get("/api/holodos/userId?userId={userId}", userId))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void shouldAddUserToHolodos() throws Exception {
        String holodosJson = "{\"name\":\"Test Holodos\"}";
        String holososResponse = mockMvc.perform(post("/api/holodos/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(holodosJson))
                .andReturn().getResponse().getContentAsString();

        long holososId = gson.fromJson(holososResponse, JsonObject.class).get("id").getAsLong();

        String userJson = "{\"firstName\":\"Jane\", \"lastName\":\"Doe\", \"phone\":\"9876543210\", \"role\":\"RECEIVER\"}";
        String userResponse = mockMvc.perform(post("/api/user/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andReturn().getResponse().getContentAsString();

        long userId = gson.fromJson(userResponse, JsonObject.class).get("id").getAsLong();

        mockMvc.perform(post("/api/holodos/{id}/users?userId={userId}", holososId, userId))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void shouldReturnNotFoundWhenAddingNonExistingUser() throws Exception {
        mockMvc.perform(post("/api/holodos/{id}/users?userId=999", 1))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }
}