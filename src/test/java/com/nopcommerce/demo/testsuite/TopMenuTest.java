package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenu;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

TopMenu topMenu = new TopMenu();


@Test
    public void verifyUserShouldNavigateToComputerPage(){
    topMenu.selectMenu("Computers");
    String expectedText1 = "Computers";
    String actualText1 = topMenu.verifyComputerTextSuccessfully();
    Assert.assertEquals(expectedText1, actualText1);
}
    @Test
    public void verifyUserShouldNavigateToElectronicsPage(){
        topMenu.selectMenu("Electronics");
        String expectedText2 = "Electronics";
        String actualText2 = topMenu.verifyElectronicsTextSuccessfully();
        Assert.assertEquals(expectedText2, actualText2);
    }@Test
    public void verifyUserShouldNavigateToApparelPage(){
        topMenu.selectMenu("Apparel");
        String expectedText3 = "Apparel";
        String actualText3 = topMenu.verifyApparelTextSuccessfully();
        Assert.assertEquals(expectedText3, actualText3);
    }@Test
    public void verifyUserShouldNavigateToDigitalDownloadsPage(){
        topMenu.selectMenu("Digital downloads");
        String expectedText4 = "Digital downloads";
        String actualText4 = topMenu.verifyDigitalDownloadsTextSuccessfully();
        Assert.assertEquals(expectedText4, actualText4);
    }@Test
    public void verifyUserShouldNavigateToBooksPage(){
        topMenu.selectMenu("Books");
        String expectedText5 = "Books";
        String actualText5 = topMenu.verifyBooksTextSuccessfully();
        Assert.assertEquals(expectedText5, actualText5);
    }@Test
    public void verifyUserShouldNavigateToJewelryPage(){
        topMenu.selectMenu("Jewelry");
        String expectedText6 = "Jewelry";
        String actualText6 = topMenu.verifyJewelryTextSuccessfully();
        Assert.assertEquals(expectedText6, actualText6);
    }@Test
    public void verifyUserShouldNavigateToGiftCardsPage(){
        topMenu.selectMenu("Gift Cards");
        String expectedText7 = "Gift Cards";
        String actualText7 = topMenu.verifyGiftCardTextSuccessfully();
        Assert.assertEquals(expectedText7, actualText7);
    }


}
