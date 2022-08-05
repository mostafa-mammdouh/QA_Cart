package InteractWithBrowserUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAriaRole {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
       // String role= driver.findElement(By.id("inputEmail")).getAriaRole();
        //  driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("mostafa22");
        //driver.findElement(By.id("btn-checkbox")).click();
        String role  = driver.findElement(By.id("btn-submit")).getAriaRole();
        System.out.println(role);
    }
}
