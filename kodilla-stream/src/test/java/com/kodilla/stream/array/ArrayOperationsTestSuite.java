package com.kodilla.stream.array;


import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] numbers = {1,23,31,42,5,6,5,2,99,54,22,54,12,73,85,24,35,48,42,66};
        Assert.assertEquals(36.45,ArrayOperations.getAverage(numbers),0.1);
    }
}
