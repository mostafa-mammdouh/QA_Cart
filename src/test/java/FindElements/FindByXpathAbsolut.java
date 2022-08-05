package FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByXpathAbsolut {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
        String elementText = driver.findElement(By.xpath("//ul[@class='country-list']/li[2]" )).getText();
        System.out.println(elementText);
        driver.quit();
    }
    // Xpath
    //tagName[@attribute = 'value']
    // *[@attribute = 'value']
}
