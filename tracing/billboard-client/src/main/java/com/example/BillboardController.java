package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillboardController {

    private final Logger logger = LoggerFactory.getLogger(BillboardController.class);
    private final RestTemplate restTemplate;

    public BillboardController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/message")
    public String get(){

        logger.info("Calling message-service");
        Quote quote = restTemplate.getForObject("http://localhost:8081/", Quote.class);
        return quote.getQuote() + " -- " + quote.getAuthor();
    }
}
