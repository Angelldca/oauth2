package com.angelldca.oauth.client.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class ClientController {

    @GetMapping("/hello")
    public ResponseEntity<String> saludo(){
        return ResponseEntity.ok("Hello");
    }
    @GetMapping("/authorized")
    public Map<String,String> authorize(@RequestParam String code) {
        return Collections.singletonMap("authorizationCode", code);
    }
}
