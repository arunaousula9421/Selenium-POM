package com.selenium.pom.Page;

import com.selenium.pom.PageObject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by arun on 16/03/2018.
 */
public class SignUpPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "address")
    private WebElement address;

    @FindBy(id = "zipcode")
    private WebElement zipCode;

    @FindBy(id = "signup")
    private WebElement submitButton;


    /*
    The idea here is to move this assertion into the constructor of the page object. Then the creation will fail if the page object for some reason does not get ready in time.
     */

    public SignUpPage(WebDriver driver){
        super(driver);
        Assert.assertTrue(firstName.isDisplayed());
    }


    public void enterName(String firstName, String lastName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);

        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public void enterAddress(String address, String zipCode){
        this.address.clear();
        this.address.sendKeys(address);

        this.zipCode.clear();
        this.zipCode.sendKeys(zipCode);
    }

    public ReceiptPage submit(){
        this.submitButton.click();
        return new ReceiptPage(driver);
    }

}
