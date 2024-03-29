package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends BasePage{

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreBttn;

    @FindBy(xpath = "//a[@href='#switchTab'][2]")
    public WebElement empAndDeps;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement link;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMention;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestion;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBttn;

    @FindBy(id = "question_0")
    public WebElement question;




    public void addContact(String email){
        String emailLocator = "//div[@class='bx-finder-company-department-employee-name' and .='" + email +"']";
        Driver.get().findElement(By.xpath(emailLocator)).click();

    }

    public boolean checkIfAdded(String email){
        String checkLocator = "//a[@class='feed-add-post-destination-new' and .='"+ email +"']";

        if(Driver.get().findElement(By.xpath(checkLocator)).isDisplayed()){
            return true;
        }else{
            return false;
        }
    }



}
