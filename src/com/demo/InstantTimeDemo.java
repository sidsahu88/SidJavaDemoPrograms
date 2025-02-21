package com.demo;

import java.time.Duration;
import java.time.Instant;

public class InstantTimeDemo {
    public static void main(String[] args) {
        Instant startTime = Instant.now();

        for (long i = 0; i < 500000; i++) {
        }

        Instant endTime = Instant.now();
        Duration timeElapsed = Duration.between(startTime, endTime);

        System.out.println(Long.valueOf(timeElapsed.toMillis()));
    }
}
