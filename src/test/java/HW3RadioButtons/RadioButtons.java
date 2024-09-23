package HW3RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
//1. Choose Your Favorite Beverage:
//   - Select the Juice radio button from the list of favorite beverages.
        WebElement JuiceButton= driver.findElement(By.xpath("//input[@value='Juice']"));
    JuiceButton.click();
//2. Preferred Working Environment:
//   - Retrieve all radio buttons in the Preferred Working Environment section.
//   - Traverse through the list of radio buttons in code and select the Hybrid option.
        List<WebElement> workEnv=driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        workEnv.forEach(x->{
            if (x.getAttribute("value").equals("hybrid")){
                x.click();
            }
        });
        //3. Choose Your Favorite Season:
        //   - If the Spring radio button is disabled, click on the "Enable Buttons" button.
        //   - Ensure that the Spring option is now enabled, then select it.
        //   - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
        //   - Verify that the Winter option is displayed after clicking and is available for selection.
        List<WebElement> seasons=driver.findElements(By.xpath("//input[@name='season']"));
        seasons.forEach(a->{
            if (a.getAttribute("value").equals("spring")){
                WebElement enableButton= driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
                enableButton.click();
            }
        });
        WebElement springButton= driver.findElement(By.xpath("//input[@value='spring']"));
        boolean statusSpringBtn= springButton.isEnabled();
        if (statusSpringBtn){
            springButton.click();
        }

        WebElement winterRB= driver.findElement(By.xpath("//input[@value='winter']"));
        boolean WinterButton= winterRB.isDisplayed();
        WebElement showButtons= driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        if(!WinterButton){
            showButtons.click();
        }

        if (!WinterButton){
            winterRB.click();
        }
//4. Preferences:
//   - Verify that the **Receive Notifications** checkbox is disabled.
//   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox
        List<WebElement> favmeals=driver.findElements(By.xpath("//input[@name='meal']"));
        favmeals.forEach(a->{
            if(a.getAttribute("value").equals("lunch")){
                a.click();
            }
        });
    }
}

