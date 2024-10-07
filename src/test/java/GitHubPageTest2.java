import com.shaft.driver.SHAFT;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GitHubPageTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        // Get the browser type dynamically from the system properties
        String browser = System.getProperty("browser", "chrome");  // default is Chrome

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);

        // Connect to Selenium Grid (localhost in this case)
        //driver = new RemoteWebDriver(new URL("http://localhost:4444/"), capabilities);
        driver = new ChromeDriver();
    }
    @Test(description = "Verify Google Title Test")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Google Search")
    @Story("User should see the correct title on the homepage")
    public void openGitHubHomePage() {
        // Open GitHub's website
        driver.get("https://github.com");
        System.out.println("Hey. Title is: " + driver.getTitle());
    }
    @Test()
    public void openGitHubHomePage2() {
        // Open GitHub's website
        SHAFT.GUI.WebDriver driver2;

        driver2 = new SHAFT.GUI.WebDriver();
        driver2.browser().navigateToURL("https://github.com");
        System.out.println("Hey. Title is: " + driver.getTitle());
    }
    @AfterMethod
    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
        ScreenshotHelper  screenshot= new ScreenshotHelper();
        screenshot.takeScreenshot(driver);
        
    }
}
