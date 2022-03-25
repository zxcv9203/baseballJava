package com.programmers.java.baseball.engine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.function.BiConsumer;

@AllArgsConstructor
@ToString
public class Numbers {
    private Integer[] nums;

    public void indexedForEach(BiConsumer<Integer, Integer> c) {
        for (int i = 0; i < nums.length; i++) {
            c.accept(nums[i], i);
        }
    }
}
