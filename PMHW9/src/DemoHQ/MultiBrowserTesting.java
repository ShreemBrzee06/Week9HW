package DemoHQ;

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
    static String browser = "Chrome"; // global variable for browser
    static WebDriver driver; // global variable for driver
    static String url = "https://www.demostack.com/"; // global variable for url
    static String expectedTitle = "Home – Demostack"; // global variable for page title
    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);

        }else{
            System.out.println("Invalid Error");
        }

        driver.get(url); // launch url
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));// WAIT
        String actualTitle = driver.getTitle();
        System.out.println("The acutal title of page is " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

        }

    }

