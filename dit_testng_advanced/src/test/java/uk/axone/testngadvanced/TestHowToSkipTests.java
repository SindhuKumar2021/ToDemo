package uk.axone.testngadvanced;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestHowToSkipTests {

    @Test
    public void doLoginTest() {
        System.out.println("Login test");
    }

    @Test
    public void logoutTest() {
        System.out.println("Logout test");
    }

    //@Ignore
    //@Test(enabled = false)
    @Test
    public void verifyHomePageTest() {
        System.out.println("Home page test");
        //if (!dataIsAvailable) --> to perform a conditional check and evaluate the data is present or not.
        throw new SkipException("Data is still not available. Please try later...JIRA-1991");
    }

    @Test
    public void verifyLandingPageTest() {
        System.out.println("Landing page test");
    }


}
