package openingBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriverUsingDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","");
        WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
    }

}
