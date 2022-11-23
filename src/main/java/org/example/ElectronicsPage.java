package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils
{
    private By _cameraAndPhoto = By.linkText("Camera & photo");
    public void directingToTheCameraPage()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/electronics",10);

        clickOnElement(_cameraAndPhoto);
    }

}
