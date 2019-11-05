package com.epam.taf;

import com.epam.taf.steps.Steps;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.annotation.XmlType;

public class SmokeTest extends CommonConditions {
    private static final String DEFAULT_SORT = "Популярные";


    @Test
    public void userCanLogin() {

        Assert.assertTrue(Steps.verifyDefaultSort(DEFAULT_SORT));
    }
}
