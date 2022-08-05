package InteractWithBrowserUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
        driver.findElement(By.id("inputEmail")).sendKeys("mostafamamdou675@gmail.com");
        driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("mostafa22");
        driver.findElement(By.id("btn-checkbox")).click();
        Point name  = driver.findElement(By.id("btn-submit")).getLocation();
        System.out.println(name.x);
    }
}
