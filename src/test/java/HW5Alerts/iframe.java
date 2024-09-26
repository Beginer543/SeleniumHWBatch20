package HW5Alerts;

import HW4DropDownwithoutSel.DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe { public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        // Locate the iframe for username and switch focus
        WebElement frameUserName = driver.findElement(By.xpath("//iframe[@id='textfieldIframe']"));
        driver.switchTo().frame(frameUserName);

        // Find the username input box and enter "Tom"
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='Username']"));
        usernameTextBox.sendKeys("Tom");

        // Switch focus back to the main page
    driver.switchTo().defaultContent();

        // Locate the iframe for the city dropdown and switch focus
        WebElement frameCity = driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
        driver.switchTo().frame(frameCity);

        // Select "Dallas" from the dropdown
        Select cityDropDown = new Select(driver.findElement(By.id("cities")));
        cityDropDown.selectByVisibleText("Dallas");


  //
        WebElement frameage = driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        driver.switchTo().frame(frameage);
        WebElement age = driver.findElement(By.xpath("//input[@class='cb1-element']"));
     age.click();


    }
}