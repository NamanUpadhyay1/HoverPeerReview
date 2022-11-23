package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MacBookPage extends Utils
{
    private By _emailAFriend = By.xpath("//button[@class='button-2 email-a-friend-button']");
    //given key and value of the locator at the top for ease at the time of code refinement.
    private By _friendsEmail = By.id("FriendEmail");
    //given key and value of the locator at the top for ease at the time of code refinement.

    private By _yourEmail = By.id("YourEmailAddress");
    //given key and value of the locator at the top for ease at the time of code refinement.
    private By _mailMessage = By.id("PersonalMessage");
    //given key and value of the locator at the top for ease at the time of code refinement.
    private By _sendButton = By.name("send-email");
    //given key and value of the locator at the top for ease at the time of code refinement.

    public void macbookDetails()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/apple-macbook-pro-13-inch",15);
        //waitForUrlToBe() will wait until "15" period ends.
        clickOnElement(_emailAFriend);
        //to click the given locator
        typeText(_friendsEmail,"Chirag@gmail.com");
        //to enter the data in the given locator.
        typeText(_mailMessage,"You need to checkout this awesome new apple product!!");
        //to enter the data in the given locator.
        clickOnElement(_sendButton);
        //to click the given locator.
        String emailSuccessMSG = getText(By.xpath("//div[@class=\"result\"]"));
        //this will store the retrieved data via xpath in the string "emailSuccessMSG".
        Assert.assertEquals(emailSuccessMSG,"Your message has been sent.");
        //to compare expected and actual results.
    }
}
