package comnopcommerce;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static WebDriver driver; // global static variable
   static  String url = "https://demo.nopcommerce.com/";
   static String expectedTitle = "nopCommerce demo store";

        public static void main(String[] args) { // main method

        ChromeOptions options = new ChromeOptions(); // object taken from selenium webservice website (setting webdriver)
        driver = new ChromeDriver(options);
        driver.get(url); // launch url
        driver.manage().window().maximize();// maximizing screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String ActualTitle = driver.getTitle();// getting title of page
        System.out.println("The Actual title of  Page: " + ActualTitle);
        Assert.assertTrue(expectedTitle.equals(ActualTitle));
        driver.quit();

    }
}
