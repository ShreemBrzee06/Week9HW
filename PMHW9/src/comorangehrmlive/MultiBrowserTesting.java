package comorangehrmlive;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTesting {
    static WebDriver driver;
    static String browser = "Chrome";
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "OrangeHRM";
    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);

        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);

        }else{
            System.out.println("Invalid browser");
        }
        driver.get(url);// launching url
        driver.manage().window().maximize();// maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));// WAIT
        String actualTitle = driver.getTitle();
        System.out.println("The title of the page is "+ actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();


    }
}
