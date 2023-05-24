package jpetstoredemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTesting {
    static String url = "https://jpetstore.aspectran.com/catalog/";
    static String expectedTitle = "JPetStore Demo";
    static WebDriver driver;

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url); // launch url
        driver.manage().window().maximize();// maximise
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The actual title of the page is " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
