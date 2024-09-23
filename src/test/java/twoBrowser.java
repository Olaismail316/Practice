import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class twoBrowser {
        WebDriver driver;
        @BeforeTest
        @Parameters("browser")
        public void setUp(String browser) throws MalformedURLException {
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
            } else if (browser.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
            }
        }

        @Test(priority = 1)
        public void test1() {
            driver.get("https://www.example.com");
            System.out.println("Test 1 - Page title is: " + driver.getTitle());
        }

       @Test(priority = 2)
        public void test2() {
            driver.get("https://www.example.com/contact");
            System.out.println("Test 2 - Page title is: " + driver.getTitle());
        }

        //@AfterTest
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }



