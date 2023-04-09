package Day4_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        WebElement menuItem= driver.findElement(By.xpath("//a[text()='Components']"));
        Actions act=new Actions(driver);
        act.moveToElement(menuItem).perform();
        WebElement subMenu= driver.findElement(By.xpath("//a[contains(text(), 'Monitors')]"));
        act.moveToElement(subMenu).click().perform();

    }
}