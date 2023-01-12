package com.securityexample.security.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/access")
@RequiredArgsConstructor
public class AppController {

    @GetMapping
    public ResponseEntity<String> getResult() {
        return ResponseEntity.ok("ACCESS ALLOWED");
    }
}
