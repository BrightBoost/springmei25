package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class ExampleController {
    // CRUD operaties
    // Get all >> default mapping van de class
    // Get by Id >> example/{id}
    // Create > POST en default mapping
    // Update > PUT example/{id}
    // Delete by id > DELETE example/{id}

    // bonus operaties
    // PATCH > update een enkel veld, en laat de rest ongemoeid

    @GetMapping
    @Loggable
    public String getHello() {
        return "Hiiii";
    }
}
