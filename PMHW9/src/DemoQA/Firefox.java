package DemoQA;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Firefox {
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "OrangeHRM";
    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();// setting driver
        driver = new FirefoxDriver(options);

        driver.get(url); // launch url
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle =  driver.getTitle();
        System.out.println("The Actual title of page is " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
