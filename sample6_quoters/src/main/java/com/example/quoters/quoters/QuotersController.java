package com.example.quoters.quoters;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class QuotersController {

    private final static Quote quoteNone = new Quote("");
    private final QuoteRepository repo;

    public QuotersController(QuoteRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/api")
    public List<QuoteResource> getAll() {
        return repo.findAll().stream()
                .map(quote -> new QuoteResource("success", quote))
                .collect(Collectors.toList());
    }

    @GetMapping("/api/{id}")
    public QuoteResource getOne(@PathVariable Long id) {

        return repo.findById(id)
                .map(quote -> new QuoteResource("success", quote))
                .orElse(new QuoteResource("not found", quoteNone));
    }

    @GetMapping("/api/random")
    public QuoteResource getRandom() {
        return this.getOne((long) (Math.random() * repo.count()));
    }
}
