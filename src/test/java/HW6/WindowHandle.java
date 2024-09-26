package HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");




//get window handle of the main page
        //print on the console

        String mainPageHandle=driver.getWindowHandle();

        //switch the focus of the driver to the page
        //b2 and print text
        WebElement B1PageBtn=driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']"));
        B1PageBtn.click();
        Thread.sleep(2000);

        Set<String> allHandles = driver.getWindowHandles();
for (String handle:allHandles){
    if (!handle.equals(mainPageHandle)) {
        driver.switchTo().window(handle); // Перемикання на сторінку B1
        WebElement textOfWebsite = driver.findElement(By.xpath("//h2"));
        if (textOfWebsite.getText().contains("Welcome to B1 page")) {
        }
        Thread.sleep(2000);
       // driver.close(); // Закрити сторінку B1
        driver.switchTo().window(mainPageHandle); // Перемкнутися назад на основне вікно
        break;
    }
}


        WebElement B2PageBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        B2PageBtn.click(); // Натиснути, щоб відкрити сторінку B2

        // Отримати дескриптори вікон знову після натискання B2
        allHandles = driver.getWindowHandles(); // Оновити набір дескрипторів вікон
        for (String handle : allHandles) {
            if (!handle.equals(mainPageHandle)) {
                driver.switchTo().window(handle); // Перемикання на сторінку B2
                WebElement textOfWebsite = driver.findElement(By.xpath("//h2"));
                if (textOfWebsite.getText().contains("Welcome to B2 page")) {
                    System.out.println("Текст підтверджено: " + textOfWebsite.getText());
                }
              //  driver.close(); // Закрити сторінку B2
                driver.switchTo().window(mainPageHandle); // Перемкнутися назад на основне вікно
                break;
            }
        }
    }
}