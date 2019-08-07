package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstProgram {
    @Test
    public void launchChrome()
    {
        // USing the downloaded exe
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/chromedriver");

        // Using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertTrue(pageTitle.contains("Amazon.com"));

        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);

        // close only closes the current window &
        // quit closes all the opened windows i.e. it destroys the whole driver instance
        //driver.close();
        //driver.quit();

        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().back();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().forward();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().refresh();



    }
}
