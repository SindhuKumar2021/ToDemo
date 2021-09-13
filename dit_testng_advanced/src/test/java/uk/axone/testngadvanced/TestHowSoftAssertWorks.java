package uk.axone.testngadvanced;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestHowSoftAssertWorks {

    @Test
    public void testSoftAssert(){
        //create an instance of soft assert
        SoftAssert softAssert = new SoftAssert();

        int expVal = 123;
        int actVal = 456;

        System.out.println("My first line of code");
        softAssert.assertTrue(2 > 1, "Condition evaluated to false."); // no error
        softAssert.assertEquals(actVal, expVal, "Integers are unequal..."); // error
        softAssert.assertFalse(2 > 1, "Condition evaluated to true."); // error
        softAssert.assertTrue(false, "Condition evaluated to false."); //error
        softAssert.assertFalse(true, "Condition evaluated to true."); // error

        //report all the assertion errors at once.
        softAssert.assertAll();

        System.out.println("My last line of code");

    }
}
