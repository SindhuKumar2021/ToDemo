package uk.axone.testngbasics;

import org.testng.annotations.*;


public class TestNGAnnotations {



    @BeforeClass
    public void beforeClass() {
        System.out.println("----@BeforeClass - Launch a browser");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("----@AfterClass - Close the browser");
    }


    @AfterTest
    public void afterTest() {
        System.out.println("--@AfterTest - close the connection to Database");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("------@BeforeMethod -- Navigate to the AUT and login to the application");
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("------@AfterMethod -- Logout from the application");
    }

    @Test
    public void myFirstTest() {
        System.out.println("Shopping Cart Test");
    }

    @Test
    public void mySecondTest() {
        System.out.println("Edit Basket Test");
    }

    @Test
    public void myThirdTest() {
        System.out.println("Checkout Test");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite - Make a connection to messaging queue and inject test data");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite - Release the connection to messaging queue");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("--@BeforeTest - Make a connection to Database");
    }

}
