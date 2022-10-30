import PageObjectModel.WikiHomePage;
import PageObjectModel.WikiMovieDetailsPage;
import Util.CommonUtil;
import Util.WebdriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;

public class WikiTesting  {
    WebDriver driver;
    static String WIKI_URL = "https://en.wikipedia.org/wiki/Main_Page";
    Date date = new Date();


    @BeforeTest
    public void beforeTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(WIKI_URL);

    }
    @DataProvider(name = "csvData")
    public Iterator<Object[]> csvDataProvider() throws InterruptedException {
        return CommonUtil.readfromCSV(System.getProperty("user.dir")+"/src/test/resources/TestData");
    }


    @Test(dataProvider = "csvData")
    public void test(String movieName, String releaseDate, String countryName) throws IOException {
        WikiHomePage wikiHomePage = new WikiHomePage(driver);
        wikiHomePage.searchButtonFind().sendKeys(movieName);
        wikiHomePage.clickSearchButton().click();

        WikiMovieDetailsPage wikiMovieDetailsPage = new WikiMovieDetailsPage(driver);
        String release = wikiMovieDetailsPage.release().getText();
        Assert.assertEquals(release, releaseDate);

        String country = wikiMovieDetailsPage.country().getText();
        Assert.assertEquals(countryName, country);


        WebdriverUtil webdriverUtil = new WebdriverUtil();

        String screenShotFileName= date.toString().replace(" ","-").replace(":","-");

        webdriverUtil.screenShot(driver, 0, 670, ".//screenshot//"+screenShotFileName+".png");




    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
