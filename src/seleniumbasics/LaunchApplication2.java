package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");

    }
}
