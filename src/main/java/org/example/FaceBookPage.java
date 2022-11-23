package org.example;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Utils
{
    HomePage homePage = new HomePage();
    public void facebookDetails()
    {
        Set<String> handles = driver.getWindowHandles();
        Iterator it = handles.iterator();
        String parentid = (String) it.next();
        String childid = (String) it.next();
        driver.switchTo().window(childid);
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"),"Facebook page direction is directing to incorrect page.");
        driver.switchTo().window(parentid);
    }
}
