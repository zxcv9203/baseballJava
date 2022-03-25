package com.programmers.java.baseball.practice;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();

        Integer[] nums = Stream.generate(() -> faker.number().randomDigit())
                .distinct()
                .limit(3)
                .toArray(Integer[]::new);
//        String title = faker.starTrek().location();
        long r = faker.number().randomNumber();
        System.out.println(Arrays.toString(nums));
        System.out.println(r);
    }
}
