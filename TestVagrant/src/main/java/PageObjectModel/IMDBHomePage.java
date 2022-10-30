package PageObjectModel;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
public class IMDBHomePage {

    WebDriver driver;
     private final By searchButtonSendKey=By.cssSelector("#suggestion-search");//send key

      private final By searchClick= By.xpath("//button[@id='suggestion-search-button']//*[name()='svg']");//for click

public WebElement searchSendKey(){
    return driver.findElement(searchButtonSendKey);

}
    public WebElement searchButtonForClick(){
        return driver.findElement(searchClick);

    }



}
