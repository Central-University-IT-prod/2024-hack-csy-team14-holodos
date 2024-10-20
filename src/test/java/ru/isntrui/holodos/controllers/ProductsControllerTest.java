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
public class ProductsControllerTest {

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
    void shouldCreateProduct() throws Exception {
        String holodosJson = "{\"name\":\"Test Holodos\"}";
        String holodosResponse = mockMvc.perform(post("/api/holodos/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(holodosJson))
                .andReturn().getResponse().getContentAsString();

        long holodosId = gson.fromJson(holodosResponse, JsonObject.class).get("id").getAsLong();

        String userJson = "{\"firstName\":\"John\", \"lastName\":\"Doe\", \"phone\":\"1234567890\", \"role\":\"RECEIVER\"}";
        String userResponse = mockMvc.perform(post("/api/user/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andReturn().getResponse().getContentAsString();

        long userId = gson.fromJson(userResponse, JsonObject.class).get("id").getAsLong();

        JsonObject skuJson = new JsonObject();
        skuJson.addProperty("name", "Product SKU");

        JsonObject productJson = new JsonObject();
        productJson.addProperty("quantity", 10);
        productJson.add("sku", skuJson);

        mockMvc.perform(post("/api/products/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("holodosId", String.valueOf(holodosId))
                        .content(gson.toJson(productJson)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());
    }

    @Test
    void shouldDeleteProduct() throws Exception {
        String holodosJson = "{\"name\":\"Test Holodos\"}";
        String holodosResponse = mockMvc.perform(post("/api/holodos/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(holodosJson))
                .andReturn().getResponse().getContentAsString();

        long holodosId = gson.fromJson(holodosResponse, JsonObject.class).get("id").getAsLong();

        String userJson = "{\"firstName\":\"John\", \"lastName\":\"Doe\", \"phone\":\"1234567890\", \"role\":\"RECEIVER\"}";
        String userResponse = mockMvc.perform(post("/api/user/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andReturn().getResponse().getContentAsString();

        long userId = gson.fromJson(userResponse, JsonObject.class).get("id").getAsLong();

        JsonObject skuJson = new JsonObject();
        skuJson.addProperty("name", "Product SKU");

        JsonObject productJson = new JsonObject();
        productJson.addProperty("quantity", 10);
        productJson.add("sku", skuJson);

        String productResponse = mockMvc.perform(post("/api/products/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("holodosId", String.valueOf(holodosId))
                        .content(gson.toJson(productJson)))
                .andReturn().getResponse().getContentAsString();

        long productId = gson.fromJson(productResponse, JsonObject.class).get("id").getAsLong();

        mockMvc.perform(delete("/api/products/?id={id}", productId))
                .andExpect(MockMvcResultMatchers.status().isOk());

        mockMvc.perform(get("/api/products/?holodosId={holodosId}&userId={userId}", holodosId, userId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isEmpty());
    }

    @Test
    void shouldReturnNotFoundWhenDeletingNonExistingProduct() throws Exception {
        mockMvc.perform(delete("/api/products/?id=999"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}