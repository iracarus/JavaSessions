package SeleniumIntermediate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables {
    @Test
    public void webtablesSimple()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/table.html");

        //int rowNum = driver.findElements(By.xpath(""))
        List<WebElement> rowElements = driver.findElements(By.xpath("//table/tbody/tr"));
        //System.out.println(rowElements.size());

        for(int i = 1; i<= rowElements.size(); i++)
        {
            List<WebElement> colElements = driver.findElements(By.xpath("//table/tbody/tr["+ i +"]/td"));
            //System.out.println(colElements.size());
            for(int j = 1; j <= colElements.size(); j++)
            {
                System.out.print(driver.findElement(By.xpath("//table/tbody/tr["+ i +"]/td["+j+"]")).getText());
            }
            System.out.println("");
        }

        //driver.quit();
    }
}
