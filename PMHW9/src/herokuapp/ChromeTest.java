package herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static String url = "http://the-internet.herokuapp.com/login";
    static String expectedTitle = "The Internet";
    static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions(); // setting driver
        driver = new ChromeDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actualTitle = driver.getTitle();
        System.out.println("The actual title of page is " + actualTitle);
        driver.quit();

    }

}
