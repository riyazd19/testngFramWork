package EndToEndSeleniumFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.openqa.selenium.TakesScreenshot.*;

public class ScreenShotDemo {
    static WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.get("https://www.google.com");
    }

    @Test
    public static void testScreenShot() throws IOException {
        //driver.findElement(By.id("q").sendkeys(screenShotDemo));
        driver.findElement(By.id("APjFqb"))
                .sendKeys("screenshot demo");
       // TakesScreenshot.screenShot(driver, "screenshot1");
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourcefile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourcefile,
                new File(
                        "D:\\intellij-java\\testngFramWork\\ScreenShotDemo\\ScreenShots"));
   // TakesScreenshot.screenShots(driver,"one");


    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
