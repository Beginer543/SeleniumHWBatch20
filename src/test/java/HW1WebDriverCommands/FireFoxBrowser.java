package HW1WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/");
        driver.navigate();
        String url = driver.getCurrentUrl();
        System.out.println("The URL of the page is: " + url);
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        driver.quit();
    }
}