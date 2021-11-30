package com.example.scheduler.service;



import com.example.app.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CronScheduler {

    @Autowired
    private GreetingService greetingService;

    public String doSomething(String name){
        return greetingService.getGreeting(name);
    }
}
