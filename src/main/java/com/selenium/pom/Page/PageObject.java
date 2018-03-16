package com.selenium.pom.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by arun on 16/03/2018.
 */
public class PageObject {
    protected WebDriver driver;

    //initialize the WebElements that we have annotated
    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
