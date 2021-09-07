package org.example;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tests{

    @Test
    public void testGoogle() throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "/Users/danilov.and/chromiumdriver/chromedriver");

        driver.get("https://google.com/");

        driver.quit();
    }
}
