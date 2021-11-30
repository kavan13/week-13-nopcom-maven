package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerMenu;
import com.nopcommerce.demo.testbase.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends TestBase {
    ComputerMenu computerMenu = new ComputerMenu();



    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        //	1.1 Click on Computer Menu.
        computerMenu.clickOnComputerlink();
        //	1.2 Click on Desktop
        computerMenu.clickOnDesktoplink();
        //	1.3 Select Sort By position "Name: Z to A"
        computerMenu.clickOnSortByPosition(2);

        List<WebElement> originalList;
        originalList = Collections.singletonList(computerMenu.VerifyProductArrangeInZtoA());
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        List<String> afterSortingProductName = new ArrayList<>();
        afterSortingProductName.addAll(originalProductNameList);
        Collections.sort(afterSortingProductName,Collections.reverseOrder());
        System.out.println(originalProductNameList);
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList, afterSortingProductName);


    }
}