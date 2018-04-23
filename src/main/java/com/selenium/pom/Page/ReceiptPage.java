package com.selenium.pom.Page;

import com.selenium.pom.Utils.BaseSetUp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by arun on 16/03/2018.
 */
public class ReceiptPage extends BaseSetUp{

    @FindBy(tagName = "h1")
    private WebElement header;

    public ReceiptPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isInitialized() {
        return header.isDisplayed();
    }

    public String confirmationHeader(){
        return header.getText();
    }
}
