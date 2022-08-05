package MultiWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindow {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
        String parent = driver.getWindowHandle();
        System.out.println(parent);
    }
}
