package com.nobuyuki.javatest.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicCtr {
    
    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
            new Topic("spring", "Spring MVC", "Some desc"),
            new Topic("java", "java MVC", "Some desc"),
            new Topic("c##", "c# MVC", "Some desc")
        );
    }
}
