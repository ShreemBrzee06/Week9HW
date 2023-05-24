package DemoQA;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultibrowserTesting {
    static String browser = "Firefox";
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "OrangeHRM";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);

        }else {
            System.out.println("Invalid browser");
        }
        driver.get(url); // launch url
        driver.manage().window().maximize();//maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)); // wait
        String actualTitle = driver.getTitle();
        System.out.println("The Actual title of page is " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}

