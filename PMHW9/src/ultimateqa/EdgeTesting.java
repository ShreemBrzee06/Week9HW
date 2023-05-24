package ultimateqa;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTesting {
    static String url = "https://courses.ultimateqa.com/users/sign_in";
    static String expectedTitle = "Sign In - Ultimate QA";
    static WebDriver driver;

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url); //launch
        driver.manage().window().maximize();// maximise
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The actual title of the page is " +actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
