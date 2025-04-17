package com.example.quoters.quoters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DatabaseLoader {
    @Bean
    CommandLineRunner init(QuoteRepository repo) {
        return args -> {
            repo.save(new Quote(
                    "The good thing about science is that it's true whether or not you believe in it. - Neil deGrasse Tyson"));
            repo.save(new Quote(
                    "The universe is not only queerer than we suppose, but queerer than we *can* suppose. - J.B.S. Haldane"));
            repo.save(new Quote("Science is a way of thinking much more than it is a body of knowledge. - Carl Sagan"));
            repo.save(new Quote(
                    "The most beautiful thing we can experience is the mysterious. It is the source of all true art and science. - Albert Einstein"));
            repo.save(new Quote(
                    "In science, 'fact' can only mean 'confirmed to such a degree that it would be perverse to withhold provisional assent.' - Stephen Jay Gould"));
            repo.save(new Quote(
                    "The saddest aspect of life right now is that science gathers knowledge faster than society gathers wisdom. - Isaac Asimov"));
            repo.save(new Quote("The important thing is to never stop questioning. - Albert Einstein"));
            repo.save(new Quote(
                    "Not only is the universe stranger than we imagine, it is stranger than we can imagine. - Werner Heisenberg"));
            repo.save(new Quote(
                    "The cosmos is within us. We are made of star-stuff. We are a way for the universe to know itself. - Carl Sagan"));
            repo.save(new Quote(
                    "The nitrogen in our DNA, the calcium in our teeth, the iron in our blood, the carbon in our apple pies were made in the interiors of collapsing stars. We are made of star-stuff. - Carl Sagan"));
            repo.save(new Quote("The beauty of science is that it can be wrong. - Richard Dawkins"));
            repo.save(new Quote("The scientific method is designed to teach great humility. - Carl Sagan"));
            repo.save(new Quote("The best proof is experience. - Francis Bacon"));
            repo.save(new Quote(
                    "Every great advance in science has issued from a new audacity of imagination. - John Dewey"));
            repo.save(new Quote(
                    "The goal of science is not to open the door to infinite wisdom, but to set a limit to infinite error. - Bertolt Brecht"));
            repo.save(new Quote(
                    "Science knows no country, because knowledge belongs to humanity, and is the torch which illuminates the world. - Louis Pasteur"));
            repo.save(new Quote("Research is what I'm doing when I don't know what I'm doing. - Wernher von Braun"));
            repo.save(new Quote("The one thing that I know, is that I know nothing. - Socrates"));
            repo.save(new Quote("The future of humanity is going to be decided in space. - Wernher von Braun"));
            repo.save(new Quote("Explanation is always a trade of complexity for clarity. - Robert Sapolsky"));
        };
    }
}
