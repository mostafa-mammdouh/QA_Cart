package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\indexxx");
        Dimension iphoneXR = new Dimension(414, 896);
        driver.manage().window().setSize(iphoneXR);
    }
}
