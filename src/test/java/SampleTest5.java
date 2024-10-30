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
    private SHAFT.TestData.JSON testData;

    @Epic("SHAFT Web GUI Template")
    @Story("Google Basic Validations")
    @TmsLink("TC-0011")
    @Description("Given I am on the Home page,\nThen the browser title should be 'Google'.")
    @Test(description = "Check that Home Page Title is correct.")
    public void checkHomePageTitleIsCorrect() {

        new Home1(driver).verifyBrowserTitleIsCorrect();
    }

    @Epic("SHAFT Web GUI Template")
    @Story("Google Basic Validations")@TmsLink("TC-0012")
    @Description("Given I am on the Home page,\nWhen I search for a valid query,\nThen the result stats will show some data (will not be empty).")
    @Test(description = "Check that Result Stats is not empty after searching for a query.")
    public void checkResultStatsIsNotEmptyAfterSearchingForAQuery() {
        new Home1(driver).searchForQuery(testData.getTestData("searchQuery"));
    }

    @BeforeClass(description = "Setup Test Data.")
    public void beforeClass(){
        testData = new SHAFT.TestData.JSON("simpleJSON.json");
    }

    @BeforeMethod(description = "Setup Browser instance.")
    public void beforeMethod() {
        String browser = System.getProperty("targetBrowserName", "chrome");

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
