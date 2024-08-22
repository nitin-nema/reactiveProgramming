package com.example.reactiveexample;

import io.reactivex.rxjava3.core.Flowable;

public class ReactorExample {

    public static void main(String[] args) {
        Flowable<Integer> numbers = Flowable.range(1, 10)   // Create a Flux that emits integers from 1 to 10
                .filter(n -> n % 2 == 0)                // Filter to keep only even numbers
                .map(n -> n * 2)                        // Double each number
                .doOnNext(n -> System.out.println("Processing: " + n)); // Log each number as it is processed

        numbers.subscribe(System.out::println);     // Print each number to the console
    }
}