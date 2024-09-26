package HW5Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");
//1. Birthday Reminder:
//   - Click on the "Birthday Reminder" button.
        WebElement BirthdayBut=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
BirthdayBut.click();
//   - When the alert appears, accept the alert.
org.openqa.selenium.Alert alert=driver.switchTo().alert();
alert.accept();

//2. Delete Confirmation:
//   - Click on the **"Delete File"** button.
//   - When the confirmation alert appears, **dismiss** the alert.
//   - Print the status of the action
//   (e.g., "File deletion canceled") that appears on the screen,to the console.
      WebElement  deleteBtn=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
deleteBtn.click();

org.openqa.selenium.Alert alert1=driver.switchTo().alert();
alert1.dismiss();
        System.out.println("File deletion canceled");
//3. Name Collection:
//   - Click on the **"Enter Your Name"** button.
//   - Accept the alert and provide a name.
//   - Retrieve the name that appears on the screen UI and print it on the
//   console, verifying that the correct name is displayed.
WebElement enterBtn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
enterBtn.click();

org.openqa.selenium.Alert alerts2=driver.switchTo().alert();
alerts2.sendKeys("Button");
alerts2.accept();
    }
}
