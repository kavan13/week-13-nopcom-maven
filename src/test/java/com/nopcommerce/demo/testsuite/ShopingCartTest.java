package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerMenu;
import com.nopcommerce.demo.pages.ShoppingCart;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopingCartTest extends TestBase {
    ShoppingCart shoppingCart = new ShoppingCart();
    ComputerMenu computerMenu = new ComputerMenu();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //	2.1 Click on Computer Menu.
        computerMenu.clickOnComputerlink();
        //	2.2 Click on Desktop
        computerMenu.clickOnDesktoplink();
        //	2.3 Select Sort By position "Name: A to Z"
        computerMenu.clickOnSortByPosition(1);

        //	2.4 Click on "Add To Cart"
        Thread.sleep(1000);
        shoppingCart.clickonaddToCart();

        //	2.5 Verify the Text "Build your own computer"
        Thread.sleep(1000);
        String expectedMessage1 = "Build your own computer";
        String actualMessage1 = shoppingCart.getVerifyBuildOwnComputerText();
        Assert.assertEquals(expectedMessage1, actualMessage1);

        //	2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(1000);
        shoppingCart.selectPantiumDualCoreE2200("1");
        //	2.7.Select "8GB [+$60.00]" using Select class.
        shoppingCart.setSelect8GB$60ect8GB$60("5");

        // 2.8 Select HDD radio "400 GB [+$100.00]"
        Thread.sleep(1000);
        shoppingCart.clickOnSelectHDDRadio();

        //   2.9 Select OS radio "Vista Premium [+$60.00]"
        shoppingCart.clickOnSelectVistaPremium$60();

        //  2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        // clickOnElement(By.xpath("//input[@id='product_attribute_5_10']"));
        Thread.sleep(1000);
        shoppingCart.selectMicrosoftOffice$50();
        Thread.sleep(1000);
        shoppingCart.selectMicrosoftOffice$50();
        shoppingCart.selectTotalCommander5();

        //	2.11 Verify the price "$1,475.00"
        String expectedMessage2 = "$1,475.00";
        String actualMessage2 = shoppingCart.getVerifyPrice$1475();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Text verify");

        //	2.12 Click on "ADD TO CARD" Button.
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        //After that close the bar clicking on the cross button.
        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = shoppingCart.getVerifyAddedToYourShoppingcart();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Text verify");

        shoppingCart.clickoncloseCrossButton();

        //	2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        shoppingCart.selectMouseHoverOnShoppingCart();
        shoppingCart.selectGOTOCartButton();
        //	2.15 Verify the message "Shopping cart"

        String expectedMessage4 = "Shopping cart";
        String actualMessage4 = shoppingCart.getVerifyShoppingCart();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Text verify");

        //	2.16 Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(1000);
        shoppingCart.selectClearValue();
        shoppingCart.selectChangeTheQty2("2");
        shoppingCart.clickOnUpdateShoppingCart();

        //	2.17 Verify the Total"$2,950.00"
        String expectedMessage5 = "$2,950.00";
        String actualMessage5 = shoppingCart.getVerifyPrice$2950();
        Assert.assertEquals(expectedMessage4, actualMessage4, "Text verify");

        //	2.18 click on checkbox “I agree with the terms of service”
        shoppingCart.selectCheckboxIAgree();

        //	2.19 Click on “CHECKOUT”
        shoppingCart.clickCheckout();

        //	2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedMessage6 = "Welcome, Please Sign In!";
        String actualMessage6 = shoppingCart.getVerifyWelcomePleaseSignIn();
        Assert.assertEquals(expectedMessage6, actualMessage6, "Text verify");

        //	2.21Click on “CHECKOUT AS GUEST” Tab
        shoppingCart.clickOnGuest();
        //	2.22 Fill the all mandatory field
        shoppingCart.selectFirstName("kavan");
        shoppingCart.selectLastName("Patel");
        shoppingCart.selectEmail("xyz@yahoo.com");
        shoppingCart.selectCompanyAddress("ABC");
        shoppingCart.selectCountryId("United States");
        shoppingCart.selectStateProvinceId("California");
        shoppingCart.selectcity("London");
        shoppingCart.selectAddress1("Harrow");
        shoppingCart.selectPostalCode("ha3 8ew");
        shoppingCart.selectPhoneNumber("08473732");

        //	2.23 Click on “CONTINUE”
        shoppingCart.selectContinue1();
        //	2.24 Click on Radio Button “Next Day Air($0.00)”
        shoppingCart.selectNextDayAir();
        //2.25 Click on “CONTINUE”
        shoppingCart.clickOnContinue2();
        //2.26 Select Radio Button “Credit Card” and click continuw
         shoppingCart.selectCreditCard();
         shoppingCart.setClickContinue3();
        //2.27 Select “Master card” From Select credit card dropdown
         shoppingCart.selectMasterCard("MasterCard");
        //2.28 Fill all the details
         shoppingCart.selectCardHolderName("kavan Patel");
         shoppingCart.selectCardNumber("5105105105105100");
         shoppingCart.selectExpireMonth("5");
         shoppingCart.selectExpireYear("2023");
        Thread.sleep(1000);
        shoppingCart.selectCardCode("392");
        //2.29 Click on “CONTINUE”
        shoppingCart.clickonContinue4();
        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedMessage7 = "Credit Card";
        String actualMessage7 = shoppingCart.getVerifyCreditCard();
        Assert.assertEquals(expectedMessage7,actualMessage7,"Text verify");

        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedMessage8 = "Next Day Air";
        String actualMessage8 = shoppingCart.getVerifyNextDayAir();
        Assert.assertEquals(expectedMessage8,actualMessage8,"Text verify");

        //	2.33 Verify Total is “$2,950.00”
        String expectedMessage9 = "$2,950.00";
        String actualMessage9 = shoppingCart.getVerifyTotal$2950();
        Assert.assertEquals(expectedMessage9,actualMessage9,"Text verify");

        //	2.34 Click on “CONFIRM”
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));

        //	2.35 Verify the Text “Thank You”
        String expectedMessage10 = "Thank you";
        String actualMessage10 = shoppingCart.getVerifyThankYou();
        Assert.assertEquals(expectedMessage10,actualMessage10,"Text verify");

        //	2.36 Verify the message “Your order has been successfully processed!”
        String expectedMessage11 = "Your order has been successfully processed!";
        String actualMessage11 = shoppingCart.getVerifyYourOrdersuccessfullyProcessed();
        Assert.assertEquals(expectedMessage11,actualMessage11,"Text verify");

        //	2.37 Click on “CONTINUE”
        shoppingCart.clickOncontinue5();

        //2.37 Verify the text “Welcome to our store”
        String expectedMessage12 = "Welcome to our store";
        String actualMessage12 = shoppingCart.getVerifyWelcomeToOurStore();
        Assert.assertEquals(expectedMessage12,actualMessage12,"Text verify");
    }
}