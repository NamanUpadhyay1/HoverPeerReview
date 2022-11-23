package org.example;

import org.openqa.selenium.Alert;
import org.testng.Assert;

public class VoteBtnHomePage extends Utils
{
    public void alertBoxOfVoteBox()
    {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        Assert.assertTrue(alertMessage.contentEquals("Please select an answer"),"Alert Box incorrect.");
        alert.accept();
    }
}
