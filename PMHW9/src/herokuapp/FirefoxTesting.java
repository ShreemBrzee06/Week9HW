package herokuapp;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTesting {
    static WebDriver driver;
    static String url = "http://the-internet.herokuapp.com/login";
    static String expectedTitle = "The Internet";

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions(); // setting the driver
        driver = new FirefoxDriver(options);
        driver.get(url);//launch of url
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));// wait
        String actualTitle = driver.getTitle(); // getting the title of the page
        System.out.println("The actual title of the page is " + actualTitle);// printing the actual title
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit(); // closing the driver
    }

}
