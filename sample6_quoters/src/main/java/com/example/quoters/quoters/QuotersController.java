package com.example.quoters.quoters;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class QuotersController {

    private final static Quote quoteNone = new Quote("");
    private final QuoteRepository repo;

    // construct the repo from the passed in QuoteRepository
    public QuotersController(QuoteRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/api/{id}")
    public QuoteResource getOne(@PathVariable Long id) {

        return repo.findById(id)
                .map(quote -> new QuoteResource("success", quote))
                .orElse(new QuoteResource("not found", quoteNone));
    }

}
