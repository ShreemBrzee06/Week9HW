package DemoHQ;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static WebDriver driver;
    static String url = "https://www.demostack.com/";
    static String expectedTitle = "Home – Demostack";
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions(); // driver setting
        driver = new ChromeDriver(options);
        driver.get(url); // launch url
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle =driver.getTitle();
        System.out.println("The ActualTitle of page is " + actualTitle);// getting title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle)); //
        driver.quit();


    }
}
