package uk.axone.objectidentification;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHowObjIdentificationWorks {

    WebDriver driver;

    @BeforeTest
    public void setupBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://seleniumpractice.axone-tech.uk/index.php");
        Thread.sleep(5000);
    }

    @Test
    public void testObjectId() throws InterruptedException {
        //1. to identify the element
        WebElement queryTxt = driver.findElement(By.id("search_query_top"));
        //2. to perform the required operation
        queryTxt.sendKeys("Search dresses");
        Thread.sleep(5000);
        //3. to clear the search entry
        queryTxt.clear();
        Thread.sleep(5000);
        queryTxt.sendKeys("Casual Dresses");
        Thread.sleep(2000);
        System.out.println("typed value: "+ queryTxt.getAttribute("value"));
    }

    @AfterTest
    public void tearDownBrowser(){
        driver.quit();
    }


}
