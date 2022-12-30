package com.tests;

import com.pages.Day10_C6_TestAdressLoginPage;
import com.utilities.ConfigReader;
import com.utilities.Driver;
import org.testng.annotations.Test;

public class Day10_C7_TestAdressLoginTest {
    @Test
    public void testAdressLogin(){
        //application git
       //  Driver.getDriver().get("https://www.testyou.in/Login.aspx");
       Driver.getDriver().get(ConfigReader.getProperty("test_address_url"));


        Day10_C6_TestAdressLoginPage testAdressLoginPage = new Day10_C6_TestAdressLoginPage();

        testAdressLoginPage.email.sendKeys(ConfigReader.getProperty("test_address_email"));
        testAdressLoginPage.password.sendKeys(ConfigReader.getProperty("test_address_password"));
        testAdressLoginPage.loginButton.click();

        //driver kapatma
       Driver.getDriver();

        /*
        Diyelim ki 100 tane testcase'iniz hepsinde sifre kullanmissiniz
        Daha sonra degisirse ne yparsiniz
        config.properties olmaz tum bu 100 tesr case'e gidip her biri icin sifreyi degistirmeniz
        config.properties ile config.properties'deki file gidip sadece orada sifrenin value kismini degistirmeniz yeterlidir

         */



    }
}
