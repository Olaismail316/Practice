import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class ScreenshotHelper {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] takeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}


//public void takeScreenshotAndSave(WebDriver driver, String screenshotName) {
//    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//    try {
//        Files.copy(screenshot.toPath(), Paths.get("path/to/your/folder/" + screenshotName + ".png"));
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}
