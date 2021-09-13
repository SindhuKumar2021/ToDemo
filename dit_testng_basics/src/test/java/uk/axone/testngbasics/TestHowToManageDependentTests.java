package uk.axone.testngbasics;

import org.testng.annotations.Test;

public class TestHowToManageDependentTests {

    @Test
    public void launchWebSite() {
        System.out.println("Launching the website and navigating to the application url");
    }

    @Test(dependsOnMethods = {"launchWebSite"})
    public void loginApplication() {
        System.out.println("Logging into the Application");
    }

    @Test(dependsOnMethods = {"loginApplication"})
    public void addToCartTest() {
        System.out.println("Adding the products to the shopping basket");
        int x = 1000;
        System.out.println( x / 0);
        System.out.println("End of addToCartTest");
    }


    @Test(dependsOnMethods ={"addToCartTest"})
    public void checkoutTest() {
        System.out.println("Performing checkout");
    }


}
