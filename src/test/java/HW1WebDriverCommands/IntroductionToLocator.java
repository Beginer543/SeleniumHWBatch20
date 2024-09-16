package HW1WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IntroductionToLocator { public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.navigate().to("https://syntaxprojects.com/locator-homework.php");

    WebElement fullName = driver.findElement(By.id("fullName"));
    fullName.sendKeys("John DOM");

    WebElement email = driver.findElement(By.name("yourEmail"));
    email.sendKeys("johndom@gmail.com");

    WebElement clientName = driver.findElement(By.id("clientNameId"));
    clientName.sendKeys("Tom");

    WebElement clientId = driver.findElement(By.id("ClientId"));
    clientId.sendKeys("543234568");

    WebElement clientFeedBack = driver.findElement(By.id("ClientfeedbackId"));
    clientFeedBack.sendKeys("Syntax good!");

    WebElement projectName = driver.findElement(By.id("ProjectNameId"));
    projectName.sendKeys("Selenium Projects");

    WebElement projectDeadLine = driver.findElement(By.name("ProjectTime"));
    projectDeadLine.sendKeys("09/18/2024");

    WebElement currentAddress = driver.findElement(By.id("CurrentAddressId"));
    currentAddress.sendKeys("55-87 Jamaika, New York, NY 53578");

    WebElement permanentAddress = driver.findElement(By.name("PermanentAddress"));
    permanentAddress.sendKeys(" 251 West St 99, New York, NY 05437");

    WebElement click = driver.findElement(By.linkText("Click Here."));
    click.click();
    WebElement submit = driver.findElement(By.id("btn-submit"));
    submit.click();
    Thread.sleep(10000);
    driver.quit();
}
}
