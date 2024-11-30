package com.example.awseks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public ResponseDTO welcome() {
        return ResponseDTO.success("Welcome to AWS EKS test");
    }

}
