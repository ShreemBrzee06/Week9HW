package automationpanda;

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
    static String url = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";
    static String expectedTitle = "Want to practice test automation? Try these demo sites! | Automation Panda";
    static WebDriver driver;
    static String browser = "Firefox";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            driver= new EdgeDriver(options);
        }else{
            System.out.println("Invalid browser");
        }
        driver.get(url);
        driver.manage().window().maximize();// maximise
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle =driver.getTitle();
        System.out.println("The actual title of the page is " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
