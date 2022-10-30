package PageObjectModel;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@AllArgsConstructor
public class WikiHomePage {
    WebDriver driver;
    private final By searchButton=By.className("vector-search-box-input");//send key

    private final By searchClick= By.id("searchButton");//for click

    public WebElement searchButtonFind(){
        return driver.findElement(searchButton);

    }
    public WebElement clickSearchButton(){
        return driver.findElement(searchClick);

    }
}
