package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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

    private By _searchBar = By.id("small-searchterms");

    private By _searchSubmit = By.xpath("//button[@type=\"submit\"]");

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
        typeText(_enterEmail,LoadProp.getProperty("loggemail"));
        //to enter the data in the given locator.
        typeText(_enterPassword,LoadProp.getProperty("loggpassword"));
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
    public void hoverColorOnComputersAndDesktop()
    {
        WebElement categoryLink = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        String beforeHover = categoryLink.getCssValue("color");
        System.out.println("Before Hover color for Computers : " + beforeHover);

        waitForElementToBeClickable(_registerButton,20);

        Actions builder = new Actions(driver);
        Action mouseHoverCategory = builder.moveToElement(categoryLink).build();
        mouseHoverCategory.perform();

        String afterHover = categoryLink.getCssValue("color");
        System.out.println("After Hover color for Computers : " + afterHover);
    }
    public void nikeProductsOnNikePage()
    {
        clickOnElement(_searchBar);
        typeText(_searchBar,LoadProp.getProperty("search"));
        clickOnElement(_searchSubmit);
    }

}