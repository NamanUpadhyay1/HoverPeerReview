package org.example;
import org.openqa.selenium.By;

public class HomePage extends Utils
    //HomePage class will all the functions that are done on the homepage of the given url.
{
    public By _registerButton = By.xpath("//li//a[@class=\"ico-register\"]");
    // created a specific register button object so that if in the future,if changes come then the locator can be changed from here.
    private By _electronicsButton = By.linkText("Electronics");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _voteButton = By.id("vote-poll-1");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _newsDetailsButtton = By.xpath("//div[@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _facebookButton = By.linkText("Facebook");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _appleMacBookPro = By.linkText("Apple MacBook Pro 13-inch");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _logInButton = By.linkText("Log in");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _enterEmail = By.id("Email");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _enterPassword = By.id("Password");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _returningLogInButton = By.xpath("//div[@class='buttons']//button[@type='submit']");
    //given key of the locator at the top for ease at the time of code refinement.

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
    // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe() will wait until "10" period ends.
        clickOnElement(_electronicsButton);
        //to click the given locator
    }
    public void currencyOptions()
    // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe() will wait until "10" period ends.
    }
    public void voteSelection()
    // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe() will wait until "10" period ends.
        clickOnElement(_voteButton);
        //to click the given locator
    }
    public void newReleaseDetailsButton()
    // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe() will wait until "10" period ends.
        clickOnElement(_newsDetailsButtton);
        //to click the given locator
    }
    public void clickOnFacebookButton()
    // created a method with actions in it to call it in TestSuit later.
    {
        clickOnElement(_facebookButton);
        //to click the given locator
    }
    public void clickOnLoginButton()
    // created a method with actions in it to call it in TestSuit later.
    {
        clickOnElement(_logInButton);
        //to click the given locator
        typeText(_enterEmail,"naman@gmail.com");
        //to enter the data in the given locator.
        typeText(_enterPassword,"password123");
        //to type the data in the given locator.
        clickOnElement(_returningLogInButton);
        //to click the given locator
    }
    public void clickOnMacBook()
    // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe() will wait until "10" period ends.
        clickOnElement(_appleMacBookPro);
        //to click the given locator
    }

}