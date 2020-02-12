package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillboardController {

    private final RestTemplate restTemplate;

    public BillboardController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/message")
    public String get(){
        Quote quote = restTemplate.getForObject("http://localhost:8081/", Quote.class);
        return quote.getQuote() + " -- " + quote.getAuthor();
    }
}
