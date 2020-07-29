package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FindAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sreevindhya/Desktop/seleniumlearning/sree-selenium-revision/sree-SeleniumJava/src/test/conf/browsers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        List <WebElement> alllinks = driver.findElements(By.tagName("a"));
        int n = alllinks.size();
        System.out.println(n);
//        for (WebElement each:alllinks) {
//            String hrefval = each.getAttribute("href");
//            System.out.println(hrefval);
//        }
        for (int i = 0; i<n; i=i+1)
        {
            String text = alllinks.get(i).getText();
            System.out.println(text);
        }
//        for (WebElement each:alllinks) {
//            System.out.println(each.getText(); }

    }
}
