package com.malcolmdeck.projecteuler;


import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) throws Exception {
        Instant startTime = Instant.now();
        Object answer = Problem3.largestPrimeFactor();
        Instant endTime = Instant.now();
        System.out.println("Answer: " + answer);
        System.out.println("Time elapsed: " + Duration.between(startTime, endTime).toMillis() + "ms");
    }

}
