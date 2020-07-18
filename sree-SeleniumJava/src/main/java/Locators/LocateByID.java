package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByID {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sba03/Documents/MyLearning/sree-selenium-revision/sree-SeleniumJava/src/test/conf/browsers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        WebElement elem1 = driver.findElement(By.id("search_query_top"));
        elem1.sendKeys("formal wear");
    }
}