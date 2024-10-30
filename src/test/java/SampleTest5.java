import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.pages.Home;
import org.pages.Home1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest5 {
    private  WebDriver driver;

    @Test(description = "Check that Home Page Title is correct.")
    public void checkHomePageTitleIsCorrect() {

        new Home1(driver).verifyBrowserTitleIsCorrect();
    }


    @Test(description = "Check that Result Stats is not empty after searching for a query.")
    public void checkResultStatsIsNotEmptyAfterSearchingForAQuery() {
        new Home1(driver).searchForQuery("");
    }


    @BeforeMethod(description = "Setup Browser instance.")
    public void beforeMethod() {
        String browser = System.getProperty("targetBrowserName", "edge");

        // Set capabilities based on the browser
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        driver.navigate();
    }

    @AfterMethod(description = "Teardown Browser instance.")
    public void afterMethod() {
       driver.quit();
    }
}
