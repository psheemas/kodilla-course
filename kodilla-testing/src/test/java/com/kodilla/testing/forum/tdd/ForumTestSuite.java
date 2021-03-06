package com.kodilla.testing.forum.tdd;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter=0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.print("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
}
