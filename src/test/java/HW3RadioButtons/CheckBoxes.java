package HW3RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

//1. Subscribe to Newsletter:
//   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.
        WebElement Newsletter = driver.findElement(By.id("newsletter"));

        if (Newsletter.isEnabled()) {
            Newsletter.click();
        }
//2.Select Your Hobbies:
//   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
//   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement checkbox : checkBoxes) {
            String value = checkbox.getAttribute("value");

            if (value.equalsIgnoreCase("reading") || value.equalsIgnoreCase("cooking")) {
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }


            }
        }

//3. Select Your Interests:
// Locate and click the "Show Checkboxes" button
        WebElement showCheckboxes = driver.findElement(By.id("toggleCheckboxButtons"));
        showCheckboxes.click();
// Wait for the Music checkbox to be visible and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement musicCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox' and @value='Music']")));

// Check if the Music checkbox is selected, and click it if not
        if (!musicCheckbox.isSelected()) {
            musicCheckbox.click(); // Select the Music checkbox if it is not already selected
        }
//4. Preferences:
//   - Verify that the **Receive Notifications** checkbox is disabled.
        WebElement preferences = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        if (!preferences.isEnabled()) {
            WebElement CheckBxEnable = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            CheckBxEnable.click();
        }

        Thread.sleep(2000);
        preferences.click();

    }
}








