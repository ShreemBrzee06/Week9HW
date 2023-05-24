package automationpanda;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static String url = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";
    static String expectedTitle  = "Want to practice test automation? Try these demo sites! | Automation Panda";
    static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url); // launch url#
        driver.manage().window().maximize();// maximise
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The actual title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
