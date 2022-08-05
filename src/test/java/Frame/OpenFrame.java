package Frame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFrame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");
driver.switchTo().frame("links");
driver.findElement(By.name("button secondary")).getText();
    }
}
