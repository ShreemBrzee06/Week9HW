package comorangehrmlive;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "OrangeHRM";
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver= new ChromeDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }

}
