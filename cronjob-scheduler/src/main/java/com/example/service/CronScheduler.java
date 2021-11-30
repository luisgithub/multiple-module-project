package com.example.service;


import org.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CronScheduler {
    @Autowired
    private GreetingService greetingService;

    public String doSomething(){
        return greetingService.getGreeting("jonh");
    }
}
