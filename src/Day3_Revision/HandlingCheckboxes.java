package Day3_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");


        WebDriver driver =new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        
    }
}