package comnopcommerce;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Edge {
    static WebDriver driver;
    static String url = "https://demo.nopcommerce.com/";
    static String expectedTitle ="nopCommerce demo store";
    public static void main(String[] args) {

        EdgeOptions options = new EdgeOptions(); // setting driver
        driver = new EdgeDriver(options);
        driver.get(url);// launching url;
        driver.manage().window().maximize();// maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The title of page is "+actualTitle );
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
