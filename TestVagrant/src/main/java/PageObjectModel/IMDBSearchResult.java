package PageObjectModel;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
public class IMDBSearchResult {
    WebDriver driver;

    private final By picture=By.xpath("//body/div[@id='__next']/main[1]/div[2]/div[3]/section[1]/div[1]/div[1]/section[2]/div[2]/ul[1]/li[1]/div[2]/div[1]/a[1]");

    public WebElement picturePathClick(){
        //final By picture=By.className("primary_photo");
        return driver.findElement(picture);
    }





}
