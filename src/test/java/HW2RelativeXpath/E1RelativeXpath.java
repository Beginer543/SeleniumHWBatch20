package HW2RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;
import static java.lang.Thread.sleep;

public class E1RelativeXpath {
    public static void main(String[] args) throws InterruptedException {

//Given the user navigates to `https://www.syntaxprojects.com/Xpath-homework.php`,
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        //1. The user is able to enter their hobbies using XPath.
WebElement hobies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
hobies.sendKeys("Play soccer");
//2. When the user clicks the "Click Here" button using XPath.,
        WebElement button=driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
//Thread.sleep(2000);
//3. The user successfully enters their favorite movie using XPath to find the text boxes.
WebElement favoriteMovie=driver.findElement(By.xpath("//input[contains(@name,'favoriteMovies')]"));
favoriteMovie.sendKeys("accountent");

        //4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
WebElement text=driver.findElement(By.xpath("//label[contains (text(),'amet consectetur adipisicing elit')]"));
String textofString =text.getText();
      System.out.println(textofString);

        //5. The user is able to enter the city in the designated field.
WebElement city=driver.findElement(By.xpath("//input[@name='yourCity']"));
city.sendKeys("New Yourk");

        //6. The user must use the **indexing technique** learned in class to enter  email addresses.
WebElement pesonalemail =driver.findElement(By.xpath("//input[@id='PersonalEmailID']"));
pesonalemail.sendKeys("sfdfadf@gmail.com");
        //7. The user must use the **operators technique** (e.g., `and`, `or`) to enter both the client name and client ID.
     WebElement clientName= driver.findElement(By.xpath("//input[@data-detail='one'and @type='text']"));
clientName.sendKeys("Alex");
        //8. The user can use **any XPath technique** to enter the street number and house number.

        WebElement street = driver.findElement(By.xpath("(//input[@data-detail='one'])[2]"));
        street.sendKeys("55 T. Shevchenka");

//driver.quit();
    }
}
