package HW1WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverCommandS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();// maximizes the window
        driver.navigate().to("https://www.google.com/");//navigates to `www.google.com

String titel =driver.getTitle();//the page title is printed correctly
        System.out.println("The title of the web page: "+ titel);

        // The user navigates to `https://www.syntaxprojects.com/`,
        // and the page title is printed correctly.
        driver.navigate().to("https://www.syntaxprojects.com/");
        String titel1 =driver.getTitle();
        System.out.println("The title of the web page: "+titel1);

driver.navigate().back();//navigates back to `www.google.com
driver.navigate().refresh();//The page at `www.google.com` is refreshed
        driver.close();//The browser closes after completing all the navigation steps
    }
}
