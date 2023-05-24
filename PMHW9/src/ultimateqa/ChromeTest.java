package ultimateqa;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static String url = "https://courses.ultimateqa.com/users/sign_in";
    static String expectedTitle = "Sign In - Ultimate QA";
    static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));// wait
        String actualTitle = driver.getTitle();
        System.out.println("The actual title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
