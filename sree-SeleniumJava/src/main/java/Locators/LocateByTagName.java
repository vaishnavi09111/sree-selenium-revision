package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Highlighter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static javax.swing.text.Highlighter.*;

public class LocateByTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sba03/Documents/MyLearning/sree-selenium-revision/sree-SeleniumJava/src/test/conf/browsers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        WebElement ele=driver.findElement(By.tagName("button"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ele.click();
    }
}
