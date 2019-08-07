package SeleniumIntermediate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandling {
    @Test
    public void alertHandling() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        // Step 1 : getting the text  - gettext()
        String alertText = alert.getText();
        System.out.println(alertText);
        Thread.sleep(5000);

        // Step 2 : entering text - sendKeys()
        alert.sendKeys("Hi Testing");
        Thread.sleep(5000);

        // Step 3 : confirming/ click ok
        alert.accept();
        String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertTrue(text.contains("Hi Testing"));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        // Step 4 : dismiss the alert
        alert.dismiss();
        text = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Thread.sleep(5000);
        Assert.assertTrue(text.contains("null"));
    }
}
