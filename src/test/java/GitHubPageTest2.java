import com.shaft.driver.SHAFT;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GitHubPageTest2 {
   private SHAFT.GUI.WebDriver driver2;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        // Get the browser type dynamically from the system properties
//        String browser = System.getProperty("browser", "chrome");  // default is Chrome
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setBrowserName(browser);

        // Connect to Selenium Grid (localhost in this case)
        //driver = new RemoteWebDriver(new URL("http://localhost:4444/"), capabilities);


        driver2 = new SHAFT.GUI.WebDriver();
    }

    @Test()
    public void openGitHubHomePage2() {
        // Open GitHub's website

        driver2.browser().navigateToURL("https://github.com");
        System.out.println("Hey. Title is: " + driver2.browser().getCurrentWindowTitle());
    }
    @AfterMethod
    public void tearDown() {
        if (driver2 != null) {
            driver2.quit();
        }
//        ScreenshotHelper  screenshot= new ScreenshotHelper();
//        screenshot.takeScreenshot(driver2);
        
    }
}
