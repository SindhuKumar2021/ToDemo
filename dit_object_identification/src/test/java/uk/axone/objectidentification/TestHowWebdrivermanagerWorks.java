package uk.axone.objectidentification;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestHowWebdrivermanagerWorks {

    @Test
    public void testWDM() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://uitest.automationtester.uk/");
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
    }
}
