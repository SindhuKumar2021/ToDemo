package uk.axone.testngadvanced;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestHowParameterizationWorks {

    //step 1. to specify the parameters as mentioned in the xml
    @Parameters({"URL", "username", "password", "city", "dob"})
    @Test
    //step 2. access the method params
    public void testParameterization(String url, String aUserName, String aPassword, String aCity, String aDob){
        System.out.println("My username is: " + aUserName +
                               " my password is: " + aPassword +
                               " and I live in " + aCity +
                               " my dob is: " + aDob+
                                " the url is: "+url);
    }

}
