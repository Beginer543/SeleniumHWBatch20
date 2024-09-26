package HW4DropDownwithoutSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectSelectDropDown {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
        WebElement fruit = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
//
        Select sel=new Select(fruit);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByVisibleText("Apple");
        Thread.sleep(2000);
        sel.selectByValue("Pear");

        System.out.println(sel.isMultiple());


        WebElement selectDD = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selMulitple =new Select(selectDD);

        selMulitple.selectByIndex(0);
        selMulitple.selectByVisibleText("Cooking");
        selMulitple.selectByValue("Teaching");
        Thread.sleep(2000);
        selMulitple.deselectByIndex(0);



    }
}