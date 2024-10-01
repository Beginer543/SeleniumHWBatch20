package HW7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebElement waitsBtn=driver.findElement(By.id("show_text_synchronize_three"));
waitsBtn.click();
WebElement optionBtn=driver.findElement(By.xpath("//input[@value='Option-1']"));
   optionBtn.click();

   driver.quit();
    }
}
