package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.krafttopia.com");

        String pageSource = driver.getPageSource();
        System.out.println("the current page source is "+ pageSource );
        driver.quit();
    }
}
