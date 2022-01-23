package com.teltan.qa23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class MyToysTest {

    WebDriver myToysDriver;

    @BeforeMethod
    public void setUp (){
        myToysDriver = new ChromeDriver();
        myToysDriver.get("https://www.mytoys.de/");
    }

    @Test
    public void tagDivTest(){
        List<WebElement> divEl = myToysDriver.findElements(By.tagName("div"));
        System.out.print("There are " + divEl.size() + " div elements");
        myToysDriver.findElement(By.className("header-multishop"));

    }

    @AfterMethod

    public void tesrDownn(){
        myToysDriver.close();
    }
}
