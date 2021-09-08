package org.example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Tests{

    @Test
    public void testGoogle(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/");

        List<WebElement> list = driver.findElements(By.className("gsfi"));

        list.get(1).sendKeys("selenium");

        list.get(1).submit();

        driver.quit();
    }
}
