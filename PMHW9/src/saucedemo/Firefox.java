package saucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Firefox {
    static String url = "https://www.saucedemo.com/";
    static String expectedTitle = "Swag Labs";
    static WebDriver driver;

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url );// launch url
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The actual title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
