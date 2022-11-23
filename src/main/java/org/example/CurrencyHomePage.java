package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CurrencyHomePage extends Utils {
    private By _currencyOption = By.id("customerCurrency");
    //given key of the locator at the top for ease at the time of code refinement.

    public void dollarAndEuroProductPricing()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/", 10);
        //waitForUrlToBe() will wait until "10" period ends.

        selectFromDropDownByIndex(_currencyOption, 0);
        //This will select the drop-down value by the index number.(Dollar)

        List<WebElement> dollarProductPrices = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        //This will create a List of elements on web via xpath given above and store them in the variable dollarProductPrices.

        for (WebElement dollarPrices : dollarProductPrices)
        //for loop for test case checking result.
        {
            Assert.assertTrue(dollarPrices.getText().contains("$"), "Prices sorted to dollar are incorrect.");
            //Assert is an import class from testng and this is used to compare expected and actual results with specific message which is showed when the test case fails.
        }
        selectFromDropDownByIndex(_currencyOption, 1);
        //This will select the drop-down value by the index number.(Euro)

        List<WebElement> euroProductPrices = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        //This will create a List of elements on web via xpath given above and store them in the variable euroProductPrices.

        for (WebElement euroPrices : euroProductPrices)
        //for loop for test case checking result.
        {
            Assert.assertTrue(euroPrices.getText().contains("€"), "Prices sorted to Euro are incorrect.");
            //Assert is an import class from testng and this is used to compare expected and actual results with specific message which is showed when the test case fails.
        }
    }
}
