package ultimateqa;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class Firefox {
    static String url= "https://courses.ultimateqa.com/users/sign_in";
    static String expectedTitle = "Sign In - Ultimate QA";
    static WebDriver driver;

    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize();//maximise
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));// wait
        String actualTitle = driver.getTitle();
        System.out.println("The actual title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
