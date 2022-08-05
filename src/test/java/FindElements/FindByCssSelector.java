package FindElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByCssSelector {
    public static void main(String[] args) {
        By welcomeHeader = By.id("welcome");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\mosta\\IdeaProjects\\QA_Cart\\src\\test\\resources\\index.html");
        String elementText = driver.findElement(welcomeHeader).getText();
        System.out.println(elementText);
        driver.quit();
    }
}


       //Find By Css Selector
       // #ID
       // .className
      //[data_testid=welcome_header]
     //parent_childern
       //.classname  .child
       // .parent >.child