package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day09_C2_Hard_Assertion {
    /*
    when kullanici application home page gider //http://carettahotel.com/
    then title 'in 'Caretta Hotel' ldugunu verify eder
    And login button'a click eder
    Then page title'in 'Caretta Hotel - Log in' oldugunu verify eder
     */
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
      driver.close();
    }
    @Test
    public void hardAssertion(){
//        when kullanici application home page gider //http://caretttahotel.com/
        driver.get("//http://carettahotel.com/");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
//        then title 'in 'Caretta Hotel' ldugunu verify eder
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Caretta Hotels - Home"));
//        And login button'a click eder
        driver.findElement(By.linkText("Log in")).click();
//        Then page title'in 'Caretta Hotel - Log in' oldugunu verify eder
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Caretta Hotel - Log in"));
    }

}
