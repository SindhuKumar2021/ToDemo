package uk.axone.seleniumadvanced;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestLaunchBrowser {

    @Test
    public void testSimpleLaunchBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/karthik/Documents/software/drivers/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        Thread.sleep(10000);
        driver.close();
    }
}
