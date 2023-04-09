package Day5_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\.jdks\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/contact-sales/");
        driver.manage().window().maximize();
        WebElement countryDdl= driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
        Select country =new Select(countryDdl);
       // country.selectByIndex(12);
        //country.selectByValue("Australia");
       // country.selectByVisibleText("Brazil");
       List<WebElement> countrylist =country.getOptions();
       for (WebElement nation:countrylist){
           String countryName=nation.getText();
           if (countryName.equalsIgnoreCase("morocco")){
               nation.click();
               break;
           }
       }
    }
}