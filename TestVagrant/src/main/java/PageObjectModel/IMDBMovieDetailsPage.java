package PageObjectModel;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
public class IMDBMovieDetailsPage {
    WebDriver driver;

    public WebElement release(){
        final By releaseDate =By.cssSelector("main.ipc-page-wrapper.ipc-page-wrapper--base:nth-child(6) div.ipc-page-content-container.ipc-page-content-container--full.sc-6eab0fb3-0.fkOMyK section.ipc-page-background.ipc-page-background--base.sc-9b716f3b-0.hWwhTB:nth-child(3) div.ipc-page-content-container.ipc-page-content-container--center:nth-child(3) section.ipc-page-background.ipc-page-background--base.sc-b1d8602f-0.jtTbgg div.ipc-page-grid.ipc-page-grid--bias-left div.sc-b1d8602f-1.fuYOtZ.ipc-page-grid__item.ipc-page-grid__item--span-2 section.ipc-page-section.ipc-page-section--base.celwidget:nth-child(37) div.sc-f65f65be-0.ktSkVi ul.ipc-metadata-list.ipc-metadata-list--dividers-all.ipc-metadata-list--base li.ipc-metadata-list__item.ipc-metadata-list-item--link:nth-child(1) div.ipc-metadata-list-item__content-container ul.ipc-inline-list.ipc-inline-list--show-dividers.ipc-inline-list--inline.ipc-metadata-list-item__list-content.base li.ipc-inline-list__item > a.ipc-metadata-list-item__list-content-item.ipc-metadata-list-item__list-content-item--link");
        return driver.findElement(releaseDate);
    }

    public WebElement country(){
         final By countryName=By.cssSelector("main.ipc-page-wrapper.ipc-page-wrapper--base:nth-child(6) div.ipc-page-content-container.ipc-page-content-container--full.sc-6eab0fb3-0.fkOMyK section.ipc-page-background.ipc-page-background--base.sc-9b716f3b-0.hWwhTB:nth-child(3) div.ipc-page-content-container.ipc-page-content-container--center:nth-child(3) section.ipc-page-background.ipc-page-background--base.sc-b1d8602f-0.jtTbgg div.ipc-page-grid.ipc-page-grid--bias-left div.sc-b1d8602f-1.fuYOtZ.ipc-page-grid__item.ipc-page-grid__item--span-2 section.ipc-page-section.ipc-page-section--base.celwidget:nth-child(37) div.sc-f65f65be-0.ktSkVi ul.ipc-metadata-list.ipc-metadata-list--dividers-all.ipc-metadata-list--base li.ipc-metadata-list__item:nth-child(2) div.ipc-metadata-list-item__content-container ul.ipc-inline-list.ipc-inline-list--show-dividers.ipc-inline-list--inline.ipc-metadata-list-item__list-content.base li.ipc-inline-list__item > a.ipc-metadata-list-item__list-content-item.ipc-metadata-list-item__list-content-item--link");
         return driver.findElement(countryName);
    }
}
