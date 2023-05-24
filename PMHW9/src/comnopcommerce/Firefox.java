package comnopcommerce;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Firefox {
    static WebDriver driver;
    static String url = "https://demo.nopcommerce.com/";
    static String expectedTitle = "nopCommerce demo store";
    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions(); // setting web driver
        driver = new FirefoxDriver(options);
        driver.get(url); // launching url
        driver.manage().window().maximize();// maximize screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String ActualTitle = driver.getTitle(); // GETTING TITLE
        System.out.println("Title of the page is " +ActualTitle);//PRINTING TITLE OF PAGE
        Assert.assertTrue(expectedTitle.equals(ActualTitle));
        driver.close();
    }
}
