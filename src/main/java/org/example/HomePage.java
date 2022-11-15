package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class HomePage extends Utils
    //HomePage class will all the functions that are done on the homepage of the given url.
{
    public By _registerButton = By.xpath("//li//a[@class=\"ico-register\"]");
    // created a specific register button object so that if in the future,if changes come then the locator can be changed from here.

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
}