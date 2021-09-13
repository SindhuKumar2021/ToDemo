package uk.axone.testngbasics;

import org.testng.annotations.Test;

public class TestNGOrderOfExecution {

    @Test
    public void doLoginTest(){
        System.out.println("Login Test");
    }

    @Test
    public void verifyHomePageTest(){
        System.out.println("Home Page Test");
    }

    @Test
    public void logoutTest(){
        System.out.println("logout Test");
    }


}
