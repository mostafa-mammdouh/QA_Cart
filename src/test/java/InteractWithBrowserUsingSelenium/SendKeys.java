package InteractWithBrowserUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  java.time.Duration;
import  org.openqa.selenium.By;
import  org.openqa.selenium.WebElement;

public class SendKeys {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
        driver.findElement(By.id("inputEmail")).sendKeys("mostafamamdou675@gmail.com");
        driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("mostafa22");
       driver.findElement(By.id("btn-checkbox")).click();
        boolean check=driver.findElement(By.id("btn-submit")).isSelected();
        System.out.println(check);
    }
}