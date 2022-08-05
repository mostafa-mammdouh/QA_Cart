package InteractWithBrowserUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestId {
    public static void main(String[] args) {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
            driver.findElement(By.cssSelector("#email")).sendKeys("mostafamamdou675@gmail.com");
        }
        catch (Exception e){
            System.out.println("email");
            System.out.println(e);
        }
    }
}
