

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest5 {

    RemoteWebDriver driver ;

    @Test(description = "Check that Home Page Title is correct.")
    public void checkHomePageTitleIsCorrect()
    {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Ola Elnasharty");
    }

    @BeforeMethod(description = "Setup Browser instance.")
    public void beforeMethod()
    {
        String browser = System.getProperty("targetBrowserName", "edge");
        // Set capabilities based on the browser
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        driver = new RemoteWebDriver(capabilities);
    }

    @AfterMethod(description = "Teardown Browser instance.")
    public void afterMethod() {
       driver.quit();
    }
}
