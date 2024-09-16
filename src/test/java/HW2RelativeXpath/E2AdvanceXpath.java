package HW2RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2AdvanceXpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://syntaxprojects.com/advanceXpath-homework.php");
        //1.The user should enter the names of books in reverse order
        // from least favorite to favorite using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
WebElement book3=driver.findElement(By.xpath("//input[@id='least-favorite']"));
book3.sendKeys("Git Hub");
WebElement book2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
book2.sendKeys("Java");
WebElement book1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
book1.sendKeys("Selenium");

        //2. The user should enter the name of their favorite book using advanced Xpath.
WebElement name1=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
       name1.sendKeys("All the Worst Humans");
        WebElement name2=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
      name2.sendKeys("The Ministry of Time");
        WebElement name3=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
name3.sendKeys("Martyr");

       //3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
       WebElement first=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        first.sendKeys("Jak");
        WebElement second=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
second.sendKeys("Tramp");

        WebElement third=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        third.sendKeys("Tramp");





    }
}
