package com.epam.taf;

import com.epam.taf.driver.DriverSingleton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class CommonConditions {

    @BeforeMethod
    public void setUp() {

    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.closeDriver();

    }
}
