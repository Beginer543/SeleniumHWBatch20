package HW2RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
        //1. Retrieve Attribute:
        //   - Retrieve the text "inspect me to view my custom attribute" from the element and print it on the console, ensuring the text is correct.

WebElement retriveText=driver.findElement(By.id("textattr"));
String text=retriveText.getText();
        System.out.println("Retrieve Attribute: "+text);

        //2. Meal Preference:
        //   - Choose the checkbox for the meal preference "Musical Festival," ensuring the checkbox is enabled before clicking on it.
WebElement checkboxMealPreference =driver.findElement(By.xpath("//input[@value='music_festival']"));
boolean stateOfR1=checkboxMealPreference.isEnabled();
        System.out.println("The checkbox for Meal Preference 'Musical Festival' is enabled:"+stateOfR1);
      if (stateOfR1){checkboxMealPreference.click();
            System.out.println("Checkbox clicked successfully.");

        }else {
          System.out.println("Checkbox for 'Musical Festival' is disabled and cannot be clicke");

        }
        //   - Ensure that the option for "Tech Talk" is disabled.
WebElement checkTechTalk=driver.findElement(By.xpath("//input[@value='tech_talk' and @name='MealRadio']"));
     boolean stateofR2=checkTechTalk.isEnabled();
        System.out.println("The option for Tech Talk  is disabled is: "+stateofR2);

        //   - Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.
     WebElement checkbutton =driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)' and @class='btn btn-default']"));
      checkbutton.click();

      WebElement  checkArtExhibition=driver.findElement(By.xpath("//input[@value='art_exhibition' and @name='MealRadio']"));
      boolean stateofR3= checkArtExhibition.isDisplayed();
        if (stateofR3){
            System.out.println("The 'Art Exhibition' option is now visible.");
            checkArtExhibition.click();
        }else {
            System.out.println("The 'Art Exhibition' option is not visible.");
        }
//3. Mystery Message:
        //   - Retrieve the value of the attribute `title` from the element containing the text "Hover me to reveal the secret" and print it on the console.
      WebElement retrivetitle= driver.findElement(By.xpath("//div[@id='hidden_message' and @ title='Hover over me to reveal the secert']"));
   String title= retrivetitle.getText();
        System.out.println("Hover me to reveal the secret and print it on the console. "+title);

        //Option Box:
        //   - If "Checkbox 1" is enabled, click on it.
WebElement checkBox=driver.findElement(By.xpath("//input[@value='CheckboxFirst']"));
boolean stateofR4=checkBox.isEnabled();
if (stateofR4){
    System.out.println("Check box is enabled");
    checkBox.click();
}else {
    System.out.println("The check box is not enabled");
}
        //   - Ensure that "Checkbox 2" is disabled.---
  WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='disabledCheckbox']"));
checkbox2.click();
     boolean stateofR5= checkbox2.isDisplayed();
       if (!stateofR5){
           System.out.println("Checkbox 2 is disabled.");
       }else {
           System.out.println("Checkbox 2 is enabled");
       }
        //5. Input Field:
        //   - clear the text in the input box and send the text "here is the custom text entered" using selenium commands.
        WebElement text5=driver.findElement(By.id("inputField"));
        text5.clear();
        text5.sendKeys("Here is the custom text.");
        System.out.println("Here is the custom text entered");
        //
    }
}
