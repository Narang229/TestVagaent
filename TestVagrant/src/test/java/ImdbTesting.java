import PageObjectModel.IMDBHomePage;
import PageObjectModel.IMDBSearchResult;
import PageObjectModel.IMDBMovieDetailsPage;
import Util.CommonUtil;
import Util.WebdriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;

public class ImdbTesting extends BaseClass {

    WebDriver driver;
    Date date = new Date();
    static String IMDB_URL = "https://www.imdb.com/";

    @BeforeTest
    public void beforeTest() {

        WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(IMDB_URL);

    }
    @DataProvider(name = "csv")
    public Iterator<Object[]> csvDataProvider() throws InterruptedException {
        return CommonUtil.readfromCSV(System.getProperty("user.dir")+"/src/test/resources/TestDataIMDB");
    }


    @Test(dataProvider = "csv")
    public void test(String movieName, String releaseDate, String countryName) throws IOException, InterruptedException {


        IMDBHomePage imdbHomePage = new IMDBHomePage(driver);
        imdbHomePage.searchSendKey().sendKeys(movieName);
        imdbHomePage.searchButtonForClick().click();
        IMDBSearchResult imdbSearchResult = new IMDBSearchResult(driver);
        imdbSearchResult.picturePathClick().click();

        IMDBMovieDetailsPage imdbAllDetails = new IMDBMovieDetailsPage(driver);
        String releaseTime = imdbAllDetails.release().getText();

        Assert.assertEquals(releaseDate, releaseTime);

        String country = imdbAllDetails.country().getText();
        Assert.assertEquals(countryName, country);

        WebdriverUtil webdriverUtil = new WebdriverUtil();

        String screenShotFileName= date.toString().replace(" ","-").replace(":","-");

        webdriverUtil.screenShot(driver, 0, 6000, ".//screenshot//"+screenShotFileName+".png");


    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }


}
