package org.example;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest
    // TestSuit will consist of all the TestCases.
{
    HomePage homePage = new HomePage();
    // recalled HomePage because it has static methods.
    RegisterPage registerPage = new RegisterPage();
    // recalled registerPage because it has static methods.
    RegisterSuccess registerSuccess = new RegisterSuccess();
    // recalled registerSuccess because it has static methods.

    @Test
    // TestCase
    public void verifyRegistrationIsSuccessfulWithValidCredentials()
    {
            homePage.clickOnRegisterButton();
            //to perform all the actions under clickOnRegisterButton();
            registerPage.registrationDetails();
            //to perform all the actions under registrationDetails();
            registerSuccess.verifyRegistrationCompletedSuccessfully();
            //to perform all the actions under verifyRegistrationCompletedSuccessfully();
    }
}