package org.example;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
    // BaseTest class is basically the base of every single test case executed. it consists of @BeforeMethod and @AfterMethod.
{
    DriverManager driverManager = new DriverManager();
    // in order to use static method we created an object here.

    @BeforeMethod
    // @BeforeMethod will be executed before every executed method.
    public void opening()
    // usage of the method created in DriverManager class to recall the opening browser functions
    {
        driverManager.openBrowser();
        // .openBrowser(); is the static method that we created in DriverManager.
    }

    @AfterMethod
    //@AfterMethod will be executed after every executed method will be finished.
    public void closing()
    //usage of the method created in DriverManager class to recall the closing of browser function.
    {
        driverManager.closeBrowser();
        //.closeBrowser(); is the static method that we created in DriverManager.
    }
}