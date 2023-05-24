package twocheckout;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTesting {
    static String url = "https://merchantmachine.co.uk/2checkout/";
    static String expectedTitle = "2Checkout Payments Reviews: UK Fees & Pricing (2023)";
    static WebDriver driver;

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();// maximise
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
