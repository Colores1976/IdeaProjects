package com.kodilla.stream.forum.com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.average;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void arrayOperationsRestSuite() {
        //Given

        //When
        int[] numbers = {5, 1};
        //Then

      Assert.assertEquals(3.0, ArrayOperations.getAverage(numbers));
    }
}
