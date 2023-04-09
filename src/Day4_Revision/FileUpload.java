package Day4_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        //ChromeOptions options=new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");


        WebDriver driver = new ChromeDriver();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        driver.findElement(By.xpath("//input[@multiple]")).sendKeys("C:\\Users\\ahmed\\Downloads\\Ahmed");

    }
}