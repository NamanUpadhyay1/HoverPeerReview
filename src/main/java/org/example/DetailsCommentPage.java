package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DetailsCommentPage extends Utils
{
    private By _commentTitle = By.id("AddNewComment_CommentTitle");

    private By _mainComment = By.id("AddNewComment_CommentText");

    private By _submitComment = By.name("add-comment");


    public void newsCommentInformation()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/nopcommerce-new-release",15);
        typeText(_commentTitle,"test comment title.");
        typeText(_mainComment,"test main comment.");
        clickOnElement(_submitComment);
        String successMSG = getText(By.xpath("//div[@class='result']"));
        Assert.assertEquals(successMSG,"News comment is successfully added.","The Success Message of comment addition is incorrect.");
    }
}
