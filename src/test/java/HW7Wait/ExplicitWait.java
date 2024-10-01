package HW7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        //   - Click on the button **"Click me to change text!"**.
WebElement button1=driver.findElement(By.xpath("//button[@id='changetext_button']"));
button1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));

        WebElement textMsg=driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(textMsg.getText());
//2. **Enable Button**:
//   - Click on the button **"Click me to enable button"**.

       WebElement enableBtn=driver.findElement(By.xpath("//button[@id='enable_button']"));
enableBtn.click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-default' and text()='Button']")));

        WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-default' and text()='Button']"));
        button.click();
//3. **Checkbox Checked Based on Click**:
//   - Click on the button **"Click me to check the checkbox"**.
//   - Wait for the checkbox to be checked, then print the status of **isSelected** on the console to verify if the checkbox is enabled.

WebElement checkBoxBtn=driver.findElement(By.xpath("//button[@id='checkbox_button']"));
checkBoxBtn.click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='icheckbox']")));
WebElement checkBox= driver.findElement(By.xpath("//input[@id='icheckbox']"));
checkBoxBtn.isSelected();



    }
}
