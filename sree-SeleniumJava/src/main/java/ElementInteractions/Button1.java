package ElementInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button1 {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","/Users/sreevindhya/Desktop/seleniumlearning/sree-selenium-revision/sree-SeleniumJava/src/test/conf/browsers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement elem1=driver.findElement(By.id("search_query_top"));
        elem1.sendKeys("watches");
        driver.findElement(By.name("submit_search")).click();
    }
}