package Day6_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;

public class HandlingImpliciteWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

     driver.manage().window().maximize();
        driver.get("http://janbaskdemo.com/");
                driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
               // driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
       
        WebElement loginLink=driver.findElement(By.xpath("//a[text()='Login']"));

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();
}
}