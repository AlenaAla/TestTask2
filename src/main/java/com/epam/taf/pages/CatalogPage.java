package com.epam.taf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends AbstractPage{
    public static final String URL = "https://catalog.onliner.by/kettles";

    @FindBy(xpath = "//a[@class='schema-order__link']/span[@data-bind]")
    public WebElement defaultSortItem;

    public String getDefaultSort() {

        return defaultSortItem.getText();
    }


    public void openPage() {
        driver.get(URL);
    }
}
