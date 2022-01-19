package com.teltan.qa23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ContactsTest {
    WebDriver wd;
    // before test - setUp
    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","C:\\projects\\Tools\\chrome-driver");
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/");
        // wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");
    }

    // test
    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> scr = wd.findElements(By.tagName("a"));
        System.out.println(scr.size());
        wd.findElement(By.cssSelector("[href]"));
        wd.findElement(By.className("container"));

    }

    @Test
    public void testName2(){
        wd.findElement(By.tagName("script"));
        List<WebElement> scr = wd.findElements(By.tagName("script"));
        System.out.println("script = " + scr.size());
    }


    // after test - tearDown

    @AfterMethod
    public void tearDown(){
        wd.close(); // closes a tabs
        //wd.quit(); closes a browser with all tabs
    }

}
