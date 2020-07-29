package ElementInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sreevindhya/Desktop/seleniumlearning/sree-selenium-revision/sree-SeleniumJava/src/test/conf/browsers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spicejet.com/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement elem1 = driver.findElement(By.xpath("//*[@id=\'UnmrDiv\']/label"));
        elem1.click();
    }
}

