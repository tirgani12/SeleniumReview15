package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");


        WebDriver driver =new ChromeDriver();

        driver.navigate().to("https://www.facebook.com/");
        String pageSource= driver.getPageSource();
        System.out.println(pageSource);
    }
}
