package com.kodilla.testing.collection;

import java.util.*;
import org.junit.*;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case begin");
    }
    @After
    public void after(){
        System.out.println("Test case end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> emptyLibrary = new ArrayList<Integer>();
        System.out.println(emptyLibrary);
        OddNumbersExterminator tester1 = new OddNumbersExterminator();
        System.out.println(tester1.exterminate(emptyLibrary));
        Assert.assertEquals(emptyLibrary,tester1.exterminate(emptyLibrary));

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> filledLibrary = new ArrayList<Integer>();
        filledLibrary.add(1);
        filledLibrary.add(3);
        filledLibrary.add(4);
        filledLibrary.add(2);
        filledLibrary.add(7);
        filledLibrary.add(8);
        filledLibrary.add(9);
        filledLibrary.add(11);

        ArrayList<Integer> filledLibraryEven = new ArrayList<Integer>();
        filledLibraryEven.add(4);
        filledLibraryEven.add(2);
        filledLibraryEven.add(8);

        System.out.println(filledLibrary);
        OddNumbersExterminator tester = new OddNumbersExterminator();
        System.out.println(tester.exterminate(filledLibrary));
        Assert.assertEquals(filledLibraryEven,tester.exterminate(filledLibrary));
    }
}
