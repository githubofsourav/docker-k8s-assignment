package com.training.docker_k8_assignment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("")
    public ResponseEntity<String> greet() {
        String message = "Hello world!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
