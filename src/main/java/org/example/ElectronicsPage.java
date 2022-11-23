package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils
{
    private By _cameraAndPhoto = By.linkText("Camera & photo");
    //given key of the locator at the top for ease at the time of code refinement.
    public void directingToTheCameraPage()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/electronics",10);
        //waitForUrlToBe() will wait until "10" period ends.
        clickOnElement(_cameraAndPhoto);
        //this will perform click action on the locator.
    }

}
