package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void arrayOperationsRestSuite() {
        //Given

        //When
        int[] numbers = {5, 1, 2, 7, 4, 3, 2, 10, 100, 73};
        double expectedValue = 20.70;
        double result = ArrayOperations.getAverage(numbers);
        //Then

        Assert.assertEquals(expectedValue, result, 0.01);
    }
}

