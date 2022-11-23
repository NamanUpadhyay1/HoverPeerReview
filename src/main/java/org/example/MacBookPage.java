package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MacBookPage extends Utils
{
    private By _emailAFriend = By.xpath("//button[@class='button-2 email-a-friend-button']");
    private By _friendsEmail = By.id("FriendEmail");

    private By _yourEmail = By.id("YourEmailAddress");
    private By _mailMessage = By.id("PersonalMessage");
    private By _sendButton = By.name("send-email");

    public void macbookDetails()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/apple-macbook-pro-13-inch",15);
        clickOnElement(_emailAFriend);
        typeText(_friendsEmail,"Chirag@gmail.com");
        typeText(_mailMessage,"You need to checkout this awesome new apple product!!");
        clickOnElement(_sendButton);
        String emailSuccessMSG = getText(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(emailSuccessMSG,"Your message has been sent.");
    }
}
