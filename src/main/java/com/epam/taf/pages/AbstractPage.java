package com.epam.taf.pages;

import com.epam.taf.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

        protected WebDriver driver;


        protected AbstractPage() {
            this.driver = DriverSingleton.getDriver();
            PageFactory.initElements(this.driver, this);
        }
    }

