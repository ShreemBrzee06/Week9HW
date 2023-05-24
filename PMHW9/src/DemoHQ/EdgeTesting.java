package DemoHQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTesting {
    static WebDriver driver;
    static String url = "https://www.demostack.com/";
    //static String expectedTitle = "Home – Demostack";
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver();
        driver.get("url");// launch url
        driver.manage().window().maximize();//maximise screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The Actual title of the page is " +actualTitle);
        //Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
