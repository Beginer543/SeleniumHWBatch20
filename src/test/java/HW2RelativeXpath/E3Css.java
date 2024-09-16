package HW2RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3Css {
    public static void main(String[] args) throws InterruptedException {

        //- I want to navigate to `https://syntaxprojects.com/cssSelector-homework.php`

        WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://syntaxprojects.com/cssSelector-homework.php");
        //Acceptance Criteria
        //1. The user should fill in all the text boxes in the form using*CSS selectors that are unique and return only one element (1/1).
     WebElement user=driver.findElement(By.cssSelector("input#UserID"));
     user.sendKeys("5432345312");

//user name
WebElement userName=driver.findElement(By.cssSelector("input#UserName.form-control"));
userName.sendKeys("Jak");

//Intro to Le ture
        WebElement element = driver.findElement(By.cssSelector("input[data-starts='introCSSAdv']"));
element.sendKeys("Inrodaction to Selenium");

//Feedback from Ray:
WebElement feedback=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
feedback.sendKeys("This Practice is cool");

//feedback
        WebElement fedback1=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
fedback1.sendKeys("I like Selenium");


//client ID
        WebElement clientId=driver.findElement(By.cssSelector("input[data-ends='CSSModuleconclientID']"));
clientId.sendKeys("3423128754");

//email
       WebElement email= driver.findElement(By.cssSelector("input[name='email']"));
       email.sendKeys("jonsom@gmail.com");


       //Course topic
        WebElement  course=driver.findElement(By.cssSelector("input[name='CourseTopic']"));
course.sendKeys("Selenium");



        Thread.sleep(2000);
driver.quit();



    }
}
