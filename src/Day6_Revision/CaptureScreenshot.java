package Day6_Revision;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class CaptureScreenshot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        //take the screenshot and save to a file
        TakesScreenshot ts=(TakesScreenshot) driver;
       File src =ts.getScreenshotAs(OutputType.FILE);
       //save the screenshot to a specified location
        File target =new File("C:\\Users\\ahmed\\OneDrive\\Pictures\\Screenshots.png");


    }
}
