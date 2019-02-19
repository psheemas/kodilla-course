package com.kodilla.stream.array;


import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] numbers = null;
        Assert.assertEquals(36.45,ArrayOperations.getAverage(numbers),0.1);
    }
}
