package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Utils
// Created a DriverManager to store all the driver related methods ie: opening a browser and closing it. it extends Utils to use the methods from Utils.
{
    public void openBrowser()
            // created an openBrowser() method to reuse it later.
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        //setProperty is used to locate the Chrome web browser location in order to use Chrome browser later.
        driver = new ChromeDriver();
        // used to open the Chrome browser.
        driver.get("https://demo.nopcommerce.com/");
        // .get("URL"); to go to that link in the opened browser window.
        driver.manage().window().maximize();
        //.maximize(); to keep the window in fullscreen
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe is one of the methods we created in Utils class and here we used to delay the url for 10 sec.
    }
    public void closeBrowser()
    // created a closeBrowser() method to reuse it later.
    {
        driver.quit();
        // driver.quit(); will exit the browser.
    }
}