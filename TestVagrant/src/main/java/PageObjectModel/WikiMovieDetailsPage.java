package PageObjectModel;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
public class WikiMovieDetailsPage {
    WebDriver driver;

    private final By releaseDate =By.xpath("//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]");
    private final By countryName=By.cssSelector("body > div:nth-child(3) > div:nth-child(5) > div:nth-child(7) > div:nth-child(1) > table:nth-child(4) > tbody:nth-child(1) > tr:nth-child(14) > td:nth-child(2)");

    public WebElement release(){
        return driver.findElement(releaseDate);
    }

    public WebElement country(){
        return driver.findElement(countryName);
    }

}
