package Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class WebdriverUtil {

   private final Date currentDate=new Date();



    public void screenShot(WebDriver driver, int xAxis, int yAxis, String outFilePath ) throws IOException {


        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scroll("+xAxis+","+yAxis+")");


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(outFilePath));
    }

}
