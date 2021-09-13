package uk.axone.testngadvanced;

import org.testng.annotations.Test;


public class TestHowToGroupTests {

    @Test(groups = {"cart"})
    public void shoppingCartTest(){
        System.out.println("Cart Test - 1");
    }

    @Test(groups = {"cart"})
    public void shoppingCartTest2(){
        System.out.println("Cart Test - 2");
    }

    @Test(groups = {"cart", "Integration"})
    public void shoppingCartTest3(){
        System.out.println("Cart Test - 3");
    }

    @Test(groups = {"payment", "Smoke"})
    public void paymentTest(){
        System.out.println("Payment Test - 1");
    }


    @Test(groups = {"payment", "e2e"})
    public void paymentTest2(){
        System.out.println("Payment Test - 2");
    }

    @Test(groups = {"payment"})
    public void paymentTest3(){
        System.out.println("Payment Test - 3");
    }



}
