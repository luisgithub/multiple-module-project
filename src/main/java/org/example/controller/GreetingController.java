package org.example.controller;

import org.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("{name}")
    public ResponseEntity<Map<String,Object>> getGreeting(@PathVariable("name") String name){
        Map<String, Object> result = new HashMap<>();
        String greeting = greetingService.getGreeting(name);
        result.put("greeting", greeting);
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }
}
