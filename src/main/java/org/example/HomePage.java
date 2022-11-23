package org.example;
import org.openqa.selenium.By;

public class HomePage extends Utils
    //HomePage class will all the functions that are done on the homepage of the given url.
{
    public By _registerButton = By.xpath("//li//a[@class=\"ico-register\"]");
    // created a specific register button object so that if in the future,if changes come then the locator can be changed from here.
    private By _electronicsButton = By.linkText("Electronics");
    private By _voteButton = By.id("vote-poll-1");

    private By _newsDetailsButtton = By.xpath("//div[@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]");

    private By _facebookButton = By.linkText("Facebook");

    private By _appleMacBookPro = By.linkText("Apple MacBook Pro 13-inch");

    private By _logInButton = By.linkText("Log in");

    private By _enterEmail = By.id("Email");

    private By _enterPassword = By.id("Password");

    private By _returningLogInButton = By.xpath("//div[@class='buttons']//button[@type='submit']");
    public void clickOnRegisterButton()
            // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe() will wait until "10" period ends.
        waitForElementToBeClickable(_registerButton,10);
        // waitForElementToBeClickable() will wait until "5" period will end and then click the locator _registerButton.
        clickOnElement(_registerButton);
        //it will click the locator stored in _registerButton.
    }
    public void clickOnElectronics()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        clickOnElement(_electronicsButton);
    }
    public void currencyOptions()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
    }
    public void voteSelection()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        clickOnElement(_voteButton);
    }
    public void newReleaseDetailsButton()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        clickOnElement(_newsDetailsButtton);
    }
    public void clickOnFacebookButton()
    {
        clickOnElement(_facebookButton);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(_logInButton);
        typeText(_enterEmail,"naman@gmail.com");
        typeText(_enterPassword,"password123");
        clickOnElement(_returningLogInButton);
    }
    public void clickOnMacBook()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        clickOnElement(_appleMacBookPro);
    }

}