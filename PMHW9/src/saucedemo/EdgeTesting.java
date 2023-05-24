package saucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTesting {
    static String url = "https://www.saucedemo.com/";
    static WebDriver driver;
    static String expectedTitle = "Swag Labs";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();// setting driver
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The Actual title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
