package com.angelldca.resource.serve.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @GetMapping("/user")
    public ResponseEntity<String> readUser(Authentication authentication){
        return  ResponseEntity.ok("The user can read. "
                +authentication.getAuthorities()+ authentication.getName()
        );
    }

    @PostMapping("/user")
    public ResponseEntity<String> writeUser(Authentication authentication){
        return  ResponseEntity.ok("The user can write. "+authentication.getAuthorities());
    }
}
