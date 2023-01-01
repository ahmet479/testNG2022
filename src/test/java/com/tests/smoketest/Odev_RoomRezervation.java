package com.tests.smoketest;

import com.github.javafaker.Faker;
import com.pages.DefaultPage;
import com.pages.HotelReservationPage;
import com.pages.LoginPage;
import com.utilities.ConfigReader;
import com.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Odev_RoomRezervation {

    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    HotelReservationPage hotelReservationPage = new HotelReservationPage();
    Faker faker = new Faker();

    @BeforeMethod
    public void setUp() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));

        loginPage.advancedLink.click();
        loginPage.proceedLink.click();

        loginPage.username.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));
        loginPage.loginButton.click();

        Thread.sleep(5000);
        //Login'in basarili oldugunu verify ediyoruz
        Assert.assertTrue(hotelReservationPage.addRoomReservation.isDisplayed());


    }
    @Test
    public void roomRezervation() throws InterruptedException {
        Thread.sleep(5000);
        //Hotel managemente click yap.
        defaultPage.hotelManagement.click();

        Thread.sleep(5000);
        //Room reservation click et
        defaultPage.roomReservation.click();

        //add HotelReservation' a click yap
        hotelReservationPage.addRoomReservationLink.click();

        //Zorunlu butun alanlari dolduralim

        //Id user
        Select select = new Select(hotelReservationPage.idUser);
        select.selectByIndex(3);

        //id user2
        hotelReservationPage.price.sendKeys(faker.hobbit().quote());

        //DateStart
        hotelReservationPage.dateStart.sendKeys("5.10.2015");

        //dateEnd
        hotelReservationPage.dateEnd.sendKeys("1.11.2021");

        //adultAmount
        hotelReservationPage.adultAmount.sendKeys("2");

        //childrenAmount
        hotelReservationPage.childrenAmount.sendKeys("4");

        //contactNameSurname
        hotelReservationPage.contactNameSurname.sendKeys("Salih Efendi");

        //contactPhone
        hotelReservationPage.contactPhone.sendKeys("5555555222222");

        //contactEmail
        hotelReservationPage.contactEmail.sendKeys("testarcane@gmail.com");

        //notes
        hotelReservationPage.notes.sendKeys(faker.code().ean8());

        //approved
        hotelReservationPage.approvedCheckbox.click();

        //isPaid
        hotelReservationPage.isPaid.click();

        //saveButton
        hotelReservationPage.saveButton.click();

        Driver.closeDriver();

    }
}
