package DemoHQ;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest {
    static WebDriver driver;
    static String expectedTitle = "Home – Demostack";
    static String url = "https://www.demostack.com/";
    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions(); // setting driver
        driver = new FirefoxDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize(); // MAXIMISE SCREEN
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)); // WAIT
        String actualTitle = driver.getTitle();
        System.out.println("The title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();



    }
}
