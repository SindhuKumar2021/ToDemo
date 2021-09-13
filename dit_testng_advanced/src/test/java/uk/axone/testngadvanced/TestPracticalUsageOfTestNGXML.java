package uk.axone.testngadvanced;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPracticalUsageOfTestNGXML {

    @Parameters({"BrowserType"})
    @Test
    public void testXBrowser(String browserName){
        System.out.println("I am executing the test in " + browserName + " browser");
    }
}
