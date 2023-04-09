package Day6_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
      WebElement sourceCapital= driver.findElement(By.xpath("//div[text()='Rome'and@id='box6']"));
        WebElement destinationCountry=driver.findElement(By.xpath("//div[text()='Italy']"));
        Actions act=new Actions(driver);
        act.dragAndDrop(sourceCapital,destinationCountry).perform();
    }

}
