package SeleniumIntermediate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandling {
    @Test
    public void windowHandling()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for(String w : windowHandles)
        {
            driver.switchTo().window(w);
            if(driver.getTitle().contains("New"))
            {
                System.out.println("found the window");
                System.out.println("Page title for : " + w);
                System.out.println(driver.getTitle());
            }

        }




    }
}
