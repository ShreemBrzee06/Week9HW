package comorangehrmlive;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "OrangeHRM";
    public static void main(String[] args) {

        EdgeOptions options = new EdgeOptions();// setting webdriver
        driver = new EdgeDriver(options);
        driver.get(url); // launch url
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)); // wait
        String actualTitle = driver.getTitle();// getting the title of the page
        System.out.println("The title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
