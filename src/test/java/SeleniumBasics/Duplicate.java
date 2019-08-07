package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Duplicate {
    @Test
    public void duplicate()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //WebElement object = driver.findElement(By.xpath("//form/input[text()='abc']"));
        List<WebElement> objects = driver.findElements(By.xpath("//form/input[text()='abc']"));
        System.out.println(objects.size());


    }
}
