package com.example.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/api/hello"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello, World!"));
    }

    @Test
    public void testHelloNameEndpoint() throws Exception {
        String name = "John";
        mockMvc.perform(get("/api/hello/{name}", name))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello, John!"));
    }

    @Test
    public void testMessageEndpoint() throws Exception {
        String message = "Test message";
        mockMvc.perform(post("/api/message")
               .contentType(MediaType.APPLICATION_JSON)
               .content(message))
               .andExpect(status().isOk())
               .andExpect(content().string("Received message: Test message"));
    }

    @Test
    public void testCloudImageEndpoint() throws Exception {
        mockMvc.perform(get("/api/cloud-image"))
               .andExpect(status().isOk())
               .andExpect(content().contentType(MediaType.IMAGE_PNG));
    }
}