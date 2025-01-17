package util;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public static void screenShots(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourcefile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourcefile, new File("D:\\intellij-java\\testngFramWork\\ScreenShotDemo\\ScreenShots"));

    }
}
