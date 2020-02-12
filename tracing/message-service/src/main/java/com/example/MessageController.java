package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MessageController {

    private final Logger logger = LoggerFactory.getLogger(MessageController.class);
    private final QuoteRepository quoteRepository;

    public MessageController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping("/")
    public Quote radomQuote()
    {
        logger.info("returning a random quote");
        return quoteRepository.findRandomQuote();
    }

    @GetMapping("/quotes")
    public List<Quote> getAll()
    {
        logger.info("returning all quotes");
        return quoteRepository.findAll();
    }

    @GetMapping("/quotes/{id}")
    public ResponseEntity<Quote> getQuote(@PathVariable("id") Integer id) {
        logger.info("looking for quote with id={}",id);
        Optional<Quote> quote = quoteRepository.findById(id);
        if (quote.isPresent()) {
            return new ResponseEntity<>(quote.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
