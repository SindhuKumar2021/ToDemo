package uk.axone.objectidentification;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

/
public class TestHowHeadlessBrowsersWork {

    @Test
    public void testChromeHeadless(){
        ChromeOptions  options = new ChromeOptions();
        options.setHeadless(true);
        options.setAcceptInsecureCerts(true);


        System.setProperty("webdriver.chrome.driver", "/Users/karthik/Documents/software/drivers/chromedriver");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://uitest.automationtester.uk/");
        System.out.println("Title is: "+driver.getTitle());
        System.out.println("Current url is: "+driver.getCurrentUrl());
        driver.quit();

    }

    @Test(enabled = false)
    public void testHeadlessBrowsers() {
        WebDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME, true);

        driver.get("http://uitest.automationtester.uk/");
        System.out.println("Title is: "+driver.getTitle());
        System.out.println("Current url is: "+driver.getCurrentUrl());
        driver.quit();
    }

}
