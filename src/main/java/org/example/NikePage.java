package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NikePage extends Utils
{
    public void verifyNikeProducts()
    {
        List<WebElement> products=driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
        System.out.println(products.size());
        for (WebElement pro:products)
        {
            Assert.assertTrue(pro.getText().contains("Nike"),pro.getText());
            System.out.println(pro.getText());
        }
    }
}
