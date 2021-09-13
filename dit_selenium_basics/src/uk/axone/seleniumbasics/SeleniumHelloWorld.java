package uk.axone.seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHelloWorld {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/karthik/Documents/software/drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(15000);
        driver.close();
    }

}
