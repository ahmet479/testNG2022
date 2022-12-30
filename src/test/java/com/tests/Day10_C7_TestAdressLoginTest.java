package com.tests;

import com.pages.Day10_C6_TestAdressLoginPage;
import com.utilities.Driver;
import org.testng.annotations.Test;

public class Day10_C7_TestAdressLoginTest {
    @Test
    public void testAdressLogin(){
        //application git
   //     Driver.getDriver().get("https://www.testyou.in/Login.aspx");
      //  Driver.getDriver().get();

        Day10_C6_TestAdressLoginPage testAdressLoginPage = new Day10_C6_TestAdressLoginPage();

        testAdressLoginPage.email.sendKeys();
        testAdressLoginPage.password.sendKeys();
        testAdressLoginPage.loginButton.click();

        //driver kapatma
 //       Driver.

        /*
        Diyelim ki 100 tane testcase'iniz hepsinde sifrekullanmissiniz
        Daha sonra degisirse ne yparsiniz
        config.properties olmaz tum bu
         */



    }
}
