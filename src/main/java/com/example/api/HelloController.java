package com.example.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.Resource;
import java.io.IOException;
import org.springframework.core.io.InputStreamResource;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/message")
    public String createMessage(@RequestBody String message) {
        return "Received message: " + message;
    }

    @GetMapping(value = "/cloud-image", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<Resource> getCloudImage() throws IOException {
        ClassPathResource imgFile = new ClassPathResource("static/images/cloud.png");
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}