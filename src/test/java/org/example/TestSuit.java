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
    ElectronicsPage electronicsPage = new ElectronicsPage();

    CameraPhotoPage cameraPhotoPage = new CameraPhotoPage();

    CurrencyHomePage currencyHomePage = new CurrencyHomePage();

    VoteBtnHomePage voteBtnHomePage = new VoteBtnHomePage();

    DetailsCommentPage detailsCommentPage = new DetailsCommentPage();

    FaceBookPage faceBookPage = new FaceBookPage();

    MacBookPage macBookPage = new MacBookPage();
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
    public void verifyCorrectCurrencySymbolOnAllTheProducts()
    {
        homePage.currencyOptions();
        currencyHomePage.dollarAndEuroProductPricing();
    }
    @Test
    public void verifyAlertDisplayOfVoteAndAccept()
    {
        homePage.voteSelection();
        voteBtnHomePage.alertBoxOfVoteBox();
    }
    @Test
    public void verifyNewsDetailsCommentAddition()
    {
        homePage.newReleaseDetailsButton();
        detailsCommentPage.newsCommentInformation();
    }
    @Test
    public void verifyTheFaceBookPageLink()
    {
        homePage.clickOnFacebookButton();
        faceBookPage.facebookDetails();
    }
    @Test
    public void verifyRegisteredUserCanReferMacBookToFriend()
    {
        homePage.clickOnLoginButton();
        homePage.clickOnMacBook();
        macBookPage.macbookDetails();
    }


    //JD extra practice question ~ Add buttons on Camera and Photo page.
        @Test
    public void verifyProductNamesUnderCameraAndPhoto()
    {
        homePage.clickOnElectronics();
        electronicsPage.directingToTheCameraPage();
        cameraPhotoPage.addButtonsOnTheProductsOfCameraPhotoPage();
    }
}