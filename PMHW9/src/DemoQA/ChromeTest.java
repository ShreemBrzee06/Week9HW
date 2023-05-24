package DemoQA;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static WebDriver driver;
    static String url = "https://demoqa.com/";
    static String expectedTitle = "DEMOQA";
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url); // launch url
        driver.manage().window().maximize();// maximise full screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));// wait
        String actualTitle = driver.getTitle();
        System.out.println("The actual Title name of the page is " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
