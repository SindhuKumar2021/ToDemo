package uk.axone.testngadvanced;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHowAssertionWorks {

    //assertEquals - verifies that two objects are equal
    //assertTrue - verifies a condition is true
    //assertFalse - verifies a condition is false
    //assertSame - verifies that two objects refer to the same object
    //assertNotSame - verifies that two objects do not refer to the same object
    //assertNotNull - verifies that an object is not null

    //Junit syntax
    //assertEquals("", expected, actual);

    //TestNG syntax
    //assertEquals(actual, expected, "");

    @Test(groups = {"Smoke"})
    public void testAssertEquals(){

        System.out.println("First line of code");
        String expectedValue = "uk.axone";
        String actualValue = "uk.axone123";

        Assert.assertEquals(actualValue, expectedValue,"Equality check failed. Unequal strings...");

        System.out.println("Last line of code");

    }

    @Test
    public void testAssertionTrue() {
        Assert.assertTrue(2 > 5, "Condition is evaluated to false.");

    }

    @Test
    public void testAssertionFalse() {
        Assert.assertFalse(2 < 5, "Condition is evaluated to true.");
    }


}
