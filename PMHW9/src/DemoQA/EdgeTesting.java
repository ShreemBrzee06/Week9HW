package DemoQA;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTesting {
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "OrangeHRM";
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url);// launch of url
        driver.manage().window().maximize();// maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));// wait
        String actualTitle = driver.getTitle();
        System.out.println("The Actual title of a page is "+actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
