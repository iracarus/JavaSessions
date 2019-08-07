package SeleniumIntermediate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {
    @Test
    public void dragAndDrop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        WebElement frameElem = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frameElem);

        // Step 1 : Actions reference creation
        Actions builder = new Actions(driver);

        Thread.sleep(3000);
        // Step 2 : Build the action : Action Reference using the builder object from step # 1
        WebElement a = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement b = driver.findElement(By.xpath("//div[@id='droppable']"));


        // Assert 1 : Verify that the text before drop says 'Drop Here'
        Assert.assertEquals(b.getText(), "Drop here");

        //Action dragAAndDropB = builder.dragAndDrop(a, b).build();
        builder.dragAndDrop(a, b).perform();

        // Step 3 : Perform the action built in Step # 2
        //dragAAndDropB.perform();

        Thread.sleep(10000);

        // Assert 2 : Verify the text after drop is 'Dropped'

        Assert.assertEquals(b.getText(), "Dropped!");
        //Assert.assertEquals(b.getText(), "A");


    }
}
