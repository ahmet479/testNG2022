package com.tests.smoketest;

import com.pages.DefaultPage;
import com.pages.LoginPage;
import com.pages.MainPage;
import com.utilities.ConfigReader;
import com.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class Day10_C8_PositiveLoginTest {
    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    /*
        1.page object olustur==>mainPage ve LoginPage
        2. test class olustur
        page object olustur
        - mainPage objectleri olustur.
        - loginPage objectleri olustur.
    */
        MainPage mainPage = new MainPage();
        mainPage.advancedLink.click();

        mainPage.mainPageLoginLink.click();

        //Bu nokta loginPage'teyiz
        //loginPage object olustur

        LoginPage loginPage = new LoginPage();
//        loginPage.username.sendKeys("manager");
//        loginPage.password.sendKeys("manager1!");

        loginPage.username.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));
        loginPage.loginButton.click();

        //Adduser buttonunu kullanarak default page giris yaptigimizi verify et
        //Bu noktada defaultPage class'indayiz

        DefaultPage defaultPage = new DefaultPage();
        boolean logedIn =  defaultPage.addUserButton.isDisplayed();
        Assert.assertTrue(logedIn);

   //     Driver.closeDriver;

    }

}
