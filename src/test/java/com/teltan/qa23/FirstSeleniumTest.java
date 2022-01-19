package com.teltan.qa23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;
    // before test - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","C:\\projects\\Tools\\chrome-driver");
        driver.get("https://www.google.com/");
    }

    // test
    @Test
    public void openGoogleTest(){
        System.out.println("Site opened!");
     }

    // after test - tearDown

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
