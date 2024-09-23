import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class sample {
    WebDriver driver;

    String baseUrl = "https://github.com/";

    String baseUrl2 = "https://www.yahoo.com/";

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws MalformedURLException
    {


        if (browser.equalsIgnoreCase("chrome"))
        {
            ChromeOptions options = new ChromeOptions();
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
           // options.addArguments("--headless");

            driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
        }
    }
    @Test(priority = 1)
    public void testGoogleSearch() {
        // Perform a simple test
        driver.get(baseUrl);
        System.out.println("Title of the page is: " + driver.getTitle());
    }
   //@Test
    //(priority = 2)
    public void testYahooSearch() {
        // Perform a simple test
        driver.get(baseUrl2);
        System.out.println("Title of the page is: " + driver.getTitle());
    }
   //@AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
