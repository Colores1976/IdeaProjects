package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    double average = 0;

    static double getAverage(int[] numbers) {

            IntStream.range(0, numbers.length)
                    .iterator().nextInt()
                    .foreach(System.out::println);

            IntStream.range(0, numbers.length)
                    .average();
return average;
        }
    }



