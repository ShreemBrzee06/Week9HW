package herokuapp;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTesting {
    static WebDriver driver;
    static String url = "http://the-internet.herokuapp.com/login";
    static String expectedTitle = "The Internet";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver= new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();// maximise full screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The Actual title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
