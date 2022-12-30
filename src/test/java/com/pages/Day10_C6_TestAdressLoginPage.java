package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day10_C6_TestAdressLoginPage {

    public Day10_C6_TestAdressLoginPage(){

PageFactory.initElements(Driver.getDriver(),this);
}
//2. Page(sayfadaki)
    @FindBy(id = "ctl00_CPHContainer_txtUserLogin")
    public WebElement email;

    @FindBy(id = "ctl00_CPHContainer_txtPassword")
    public WebElement password;

    @FindBy(id = "ctl00_CPHContainer_btnLoginn")
    public WebElement loginButton;
}