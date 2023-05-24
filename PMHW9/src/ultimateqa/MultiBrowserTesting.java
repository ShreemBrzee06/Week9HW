package ultimateqa;

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
    static String url = "https://courses.ultimateqa.com/users/sign_in";
    static String expectedTitle = "Sign In - Ultimate QA";
    static WebDriver driver;
    static String browser = "chrome";


    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
          
        } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }else{
            System.out.println("Invalid browser");
        }
        driver.get(url);// launch url
            driver.manage().window().maximize();// maximise
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
            String actualTitle = driver.getTitle();
            System.out.println("The actual title of the page is " + actualTitle);
            Assert.assertTrue(expectedTitle.equals(actualTitle));
            driver.quit();
        }
    }

