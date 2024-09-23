package HW4DropDownwithoutSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");
        //1. Choose Your Dream Fruit:
        //   - Retrieve all options from the "Choose your Dream Fruit"
        //   dropdown.
        //   - Traverse through the list of options, and select **Mango**.
        //   - Ensure that the selection process is done by iterating through
        //   the options and not by directly clicking on the option using Xpath or any direct locator to the item.
        WebElement DD=driver.findElement(By.xpath("//div[@data-toggle='dropdown' and @id='dream_fruits']"));
     DD.click();
List<WebElement> options=driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
  for (WebElement option:options){
    String optionText=option.getText();
    if (optionText.equals("Mango")){
        option.click();
        break;
    }
  }
        //2. Choose Your Favorite Hobby:
        //   - Retrieve all options from the "Choose your Favorite Hobby"
        //   dropdown.
        //   - Traverse through the list and select **Reading**.
        //   - Ensure that the desired option is selected by iterating
        //   through the options, not by directly clicking on it using Xpath
        //   or any other direct locator to the item.
        WebElement dd=driver.findElement(By.id("favorite_hobbies"));
dd.click();
List<WebElement>Options=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
 for (WebElement Option:Options){
     String OptionText=Option.getText();
     if (OptionText.equals("Reading")){
         Option.click();
         break;
     }
 }
    Thread.sleep(2000);
     driver.quit();


    }
}
