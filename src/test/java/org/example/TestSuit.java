package org.example;
import org.openqa.selenium.By;
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
    ElectronicsPage electronicsPage = new ElectronicsPage();

    CameraPhotoPage cameraPhotoPage = new CameraPhotoPage();

    CurrencyHomePage currencyHomePage = new CurrencyHomePage();

    VoteBtnHomePage voteBtnHomePage = new VoteBtnHomePage();

    DetailsCommentPage detailsCommentPage = new DetailsCommentPage();

    FaceBookPage faceBookPage = new FaceBookPage();

    MacBookPage macBookPage = new MacBookPage();

    NikePage nikePage = new NikePage();
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
    @Test
    // TestCase
    public void verifyCorrectCurrencySymbolOnAllTheProducts()
    {
        homePage.currencyOptions();
        //to perform all the actions under currencyOptions(); method.
        currencyHomePage.dollarAndEuroProductPricing();
        //to perform all the actions under dollarAndEuroProductPricing(); method.
    }
    @Test
    // TestCase
    public void verifyAlertDisplayOfVoteAndAccept()
    {
        homePage.voteSelection();
        //to perform all the actions under voteSelection(); method.
        voteBtnHomePage.alertBoxOfVoteBox();
        //to perform all the actions under alertBoxOfVoteBox(); method.
    }
    @Test
    // TestCase
    public void verifyNewsDetailsCommentAddition()
    {
        homePage.newReleaseDetailsButton();
        //to perform all the actions under newReleaseDetailsButton(); method.
        detailsCommentPage.newsCommentInformation();
        //to perform all the actions under newsCommentInformation(); method.
    }
    @Test
    // TestCase
    public void verifyTheFaceBookPageLink()
    {
        homePage.clickOnFacebookButton();
        //to perform all the actions under clickOnFacebookButton(); method.
        faceBookPage.facebookDetails();
        //to perform all the actions under facebookDetails(); method.
    }
    @Test
    // TestCase
    public void verifyRegisteredUserCanReferMacBookToFriend()
    {
        homePage.clickOnLoginButton();
        //to perform all the actions under clickOnLoginButton(); method.
        homePage.clickOnMacBook();
        //to perform all the actions under clickOnMacBook(); method.
        macBookPage.macbookDetails();
        //to perform all the actions under macbookDetails(); method.
    }


    //JD extra practice question ~ Add buttons on Camera and Photo page.
    @Test
    // TestCase
    public void verifyProductNamesUnderCameraAndPhoto()
    {
        homePage.clickOnElectronics();
        //to perform all the actions under clickOnElectronics(); method.
        electronicsPage.directingToTheCameraPage();
        //to perform all the actions under directingToTheCameraPage(); method.
        cameraPhotoPage.addButtonsOnTheProductsOfCameraPhotoPage();
        //to perform all the actions under addButtonsOnTheProductsOfCameraPhotoPage(); method.
    }

    @Test

    public void verifyHoverBeforeAndAfterColorOnComputersMenu()
    {
        homePage.hoverColorOnComputersAndDesktop();
    }
    @Test

    public void verifyAllTheProductsListedForNikeListsNikeProductsOnly()
    {
        homePage.nikeProductsOnNikePage();
        nikePage.verifyNikeProducts();
    }
}