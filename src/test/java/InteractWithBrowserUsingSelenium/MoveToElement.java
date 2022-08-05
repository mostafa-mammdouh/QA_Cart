package InteractWithBrowserUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MoveToElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
        Actions action = new Actions(driver);
        WebElement button = driver.findElement(By.id("shit"));
        action.moveToElement(button).perform();

    }
}
