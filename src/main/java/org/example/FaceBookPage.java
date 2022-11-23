package org.example;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Utils
{
    public void facebookDetails()
    {
        Set<String> handles = driver.getWindowHandles();
        //This will give us the authority of all the windows opened currently.
        Iterator it = handles.iterator();
        //this will store all the handles 1 by 1 till the end of the windows.
        String parentid = (String) it.next();
        //the first iterator will be parent window hence we stored it in the string "parentid".
        String childid = (String) it.next();
        //the second rotation will be the child window so we stored it in "childid".
        driver.switchTo().window(childid);
        //to perform actions on the child window.
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"),"Facebook page direction is directing to incorrect page.");
        //to verify that the correct url is on.
        driver.switchTo().window(parentid);
        // to switch to the parent window.
    }
}
