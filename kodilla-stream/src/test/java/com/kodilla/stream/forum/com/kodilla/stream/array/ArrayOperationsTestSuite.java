package com.kodilla.stream.forum.com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite{

    @Test
    public void arrayOperationsRestSuite() {
        //Given

        //When
        int[] numbers = {5, 1, 2, 7, 4, 3, 2, 10, 100, 73};
    double expectedValue = 21.00;
    double result = ArrayOperations.getAverage(numbers);
        //Then

        Assert.assertEquals(expectedValue, result, 2);
    }
}
