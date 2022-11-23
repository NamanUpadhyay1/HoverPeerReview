package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraPhotoPage extends Utils
{
    public void addButtonsOnTheProductsOfCameraPhotoPage()
            // Method to be used in the test cases directly through the method name for code optimization.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/camera-photo",10);
        //waitForUrlToBe() will wait until "10" period ends.
        List<WebElement> productAddButtons = driver.findElements(By.xpath("//div[@class='item-grid']//button[@class='button-2 product-box-add-to-cart-button']"));
        //This will create a List of elements on web via xpath given above and store them in the variable productAddButtons.
        Assert.assertEquals(productAddButtons.size(),3,"Add To Cart related error.");
        //Assert is an import class from testng and this is used to compare expected and actual results.
    }
}