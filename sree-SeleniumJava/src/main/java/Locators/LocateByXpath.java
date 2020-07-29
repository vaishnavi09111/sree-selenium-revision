package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocateByXpath {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/sreevindhya/Desktop/seleniumlearning/sree-selenium-revision/sree-SeleniumJava/src/test/conf/browsers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        WebElement elem1 = driver.findElement(By.className("login"));
        elem1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement elem2 = driver.findElement(By.name("email_create"));
        elem2.sendKeys("testuser@gmail.com");
        WebElement elem3 = driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
        elem3.click();
    }
}
