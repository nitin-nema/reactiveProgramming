package com.example.reactiveProgramming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        // Create a Mono that emits a single value asynchronously
        return Mono.just("Hello, Reactive World!");
    }
}
