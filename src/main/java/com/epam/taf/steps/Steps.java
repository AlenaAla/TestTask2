package com.epam.taf.steps;

import com.epam.taf.pages.CatalogPage;

public class Steps {

    public static boolean verifyDefaultSort (String expectedSort) {
        CatalogPage page = new CatalogPage();
        page.openPage();
        String actualSort = page.getDefaultSort();
        System.out.println(actualSort);
        return actualSort.equals(expectedSort);

    }


}
