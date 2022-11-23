package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraPhotoPage extends Utils
{
    public void addButtonsOnTheProductsOfCameraPhotoPage()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/camera-photo",10);

        List<WebElement> productAddButtons = driver.findElements(By.xpath("//div[@class='item-grid']//button[@class='button-2 product-box-add-to-cart-button']"));

        Assert.assertEquals(productAddButtons.size(),3,"Add To Cart related error.");

    }
}