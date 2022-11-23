package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CurrencyHomePage extends Utils {
    private By _currencyOption = By.id("customerCurrency");

    public void dollarAndEuroProductPricing()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/", 10);

        selectFromDropDownByIndex(_currencyOption, 0);
        List<WebElement> dollarProductPrices = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));

        for (WebElement dollarPrices : dollarProductPrices)
        {
            Assert.assertTrue(dollarPrices.getText().contains("$"), "Prices sorted to dollar are incorrect.");
        }

        selectFromDropDownByIndex(_currencyOption, 1);
        List<WebElement> euroProductPrices = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));

        for (WebElement euroPrices : euroProductPrices)
        {
            Assert.assertTrue(euroPrices.getText().contains("€"), "Prices sorted to Euro are incorrect.");
        }
    }
}
