package MultiWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToWindow{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
        String parent = driver.getWindowHandle();
       driver.findElement(By.id("id")).click();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (window.equalsIgnoreCase(parent)) {
                System.out.println(driver.getTitle());
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                driver.switchTo().window(parent);
                System.out.println(driver.getTitle());
            }
        }
    }
}
