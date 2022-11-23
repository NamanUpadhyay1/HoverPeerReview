package org.example;

import org.openqa.selenium.Alert;
import org.testng.Assert;

public class VoteBtnHomePage extends Utils
{
    public void alertBoxOfVoteBox()
    {
        Alert alert = driver.switchTo().alert();
        //this is to perform actions on alert box.
        String alertMessage = driver.switchTo().alert().getText();
        //to store the alert message.
        Assert.assertTrue(alertMessage.contentEquals("Please select an answer"),"Alert Box incorrect.");
        //to compare the expected and actual message on the alert.
        alert.accept();
        //to press OK button on the simple alert box.
    }
}
