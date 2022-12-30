package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day09_C1_TestNGAnnotation {
    /*
    @Test test caseler olusturmak icin kullanilir TestNg
    @BeforeMethod her bir @Test anotiodan once kosmasi icin kullanilir, Junit @Before ile aynidir.
    @AfterMethod her bir @Test anototiondan sonra kosmasi icin kullanilir
    @Ignore bir @Test anotation -atlamak icin kullanilir
    @Test(enabled = false) durumunda @Test anotation -atlamak icin kullanilir --@Ignore gibidir

    Test case icin priority kullanarak siralama yapabiliriz
    orn:@Test (priority = 1)
     */
    @BeforeMethod
    public void setup(){
        System.out.println("Before Method kullandik");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After Method kullandik");
    }
    @Ignore
    @Test(enabled = false)
    public void test2(){
        System.out.println("Test 2");
    }
    @Test(priority = -3)
    public void test3(){
        System.out.println("Test 3");
    }
    @Test
    public void test4(){
        System.out.println("Test 4");
    }
    @Test
    public void test5(){
        System.out.println("Test 5");
    }
    @Test(priority = 2)
    public void test6(){
        System.out.println("Test 6");
    }
    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test7(){
        System.out.println("Test 7");
    }
}
