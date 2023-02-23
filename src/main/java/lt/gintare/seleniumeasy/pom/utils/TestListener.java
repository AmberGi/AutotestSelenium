package lt.gintare.seleniumeasy.pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenShot();
    }

    private void takeScreenShot() {

        try {
            TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

            String directory = "./screenshots/";
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy_MM_dd_HH_mm_SSS");

            File screenshotFinaleFile = new File(
                    directory + dateTime.format(formatter) + "_screenshot" + UUID.randomUUID() + ".jpg");

            FileUtils.copyFile(screenshotFile, screenshotFinaleFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
