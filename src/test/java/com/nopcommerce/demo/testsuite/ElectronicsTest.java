package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.pages.ShoppingCart;
import com.nopcommerce.demo.testbase.TestBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class ElectronicsTest extends TestBase {
    Electronics electronics = new Electronics();
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on “Electronics” Tab
        electronics.mouseHoverOnElectronicsTab();

        // 1.2 Mouse Hover on “Cell phones” and click
        electronics.selcectMouseHoverOnCellPhonesAndClick();

        // 1.3 Verify the text “Cell phones
        String expectedMessage = "Cell phones";
        String actualMessage = electronics.getVerifyTextCellPhones();
        Assert.assertEquals(expectedMessage, actualMessage, "Message verify");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        this.verifyUserShouldNavigateToCellPhonesPageSuccessfully();
        // 2.4 Click on List View Tab
        electronics.clickOnListViewTab();
        // 2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(1000);
        electronics.clickonproductnameNokiaLumia1020link();

        //	2.6 Verify the text “Nokia Lumia 1020”

        String expectedMessage1 = "Nokia Lumia 1020";
        String actualMessage1 = electronics.getverifyTheTextNokiaLumia1020();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Message Nokia verify");

        //2.7 Verify the price “$349.00”
        String expectedMessage2 = "$349.00";
        String actualMessage2 = electronics.getverifyThePrice$349();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Message verify price");

        //2.8 Change quantity to 2
        electronics.clearValue1();
        electronics.setChangeQuantityTo2("2");

        // 2.9 Click on “ADD TO CART” tab
        electronics.clickOnADDTOCARTTab();

        // 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar

        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = electronics.getVerifyTextproductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals(expectedMessage3, actualMessage3, "Product verify");

        // After that close the bar clicking on the cross button.
        electronics.closeTheCrossGreenBar();

        Thread.sleep(2000);
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronics.selectMouseHoverOnShoppingCart();
        Thread.sleep(2000);
        electronics.clickOnGoToCartButton();


        // 2.12 Verify the message "Shopping cart"
        Thread.sleep(1000);
        String expectedMsg = "Shopping cart";
        String actualMsg = electronics.getVerifyMessageShoppingcart();
        Assert.assertEquals(expectedMsg, actualMsg,"products in shopping cart");

        //2.14 Verify the Total $698.00
        String expectedMessage4 = "$698.00";
        String actualMessage4 = electronics.getVerifyTotal$698();
        Assert.assertEquals(expectedMessage4, actualMessage4,"Product Price");

        //2.15 click on checkbox “I agree with the terms of service”
         electronics.clickOnCheckBoxIAgree();

        //2.16 Click on “CHECKOUT”
        electronics.clickOnCheckout();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedMessage5 = "Welcome, Please Sign In!";
        String actualMessage5 = electronics.getverifyTextWelcomePleaseSignIn();
        Assert.assertEquals(expectedMessage5, actualMessage5,"please sign in");

        // 	2.18 Click on “REGISTER” tab
        electronics.clickOnRegisterTab();

        //2.19 Verify the text “Register”
        String expectedMessage6 = "Register";
        String actualMessage6 = electronics.getVerifyTextRegister();
        Assert.assertEquals(expectedMessage6, actualMessage6,"please Register");

        // 2.20 Fill the mandatory fields
       electronics.typeFirstName("kavan");
       electronics.typeLastName("patel");
        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(1000);
        electronics.typeEmail("abc"+randomGenerator+"@gmail.com");
        electronics.typePassword("Abcd1234");
        electronics.typeConfirmPassword("Abcd1234");
        //2.21 Click on “REGISTER” Button
        electronics.clickRegisterButton1();
        //	2.22 Verify the message “Your registration completed”
        String expectedMessage7 = "Your registration completed";
        String actualMessage7 = electronics.getverifyMessageYourRegistrationCompleted();
        Assert.assertEquals(expectedMessage7, actualMessage7,"please sign in");
        //2.23 Click on “CONTINUE” tab
        electronics.clickOnContinueTab1();
        // 2.24 Verify the message "Shopping cart"
        String expectedMsg8 = "Shopping cart";
        String actualMsg8 = electronics.getVerifyMessageShoppingcart();
        Assert.assertEquals(expectedMsg8, actualMsg8,"products in shopping cart");

        //2.25 click on checkbox “I agree with the terms of service”
        electronics.clickOnCheckBoxIAgree();

        //2.26 Click on “CHECKOUT”
        electronics.clickOnCheckout();
        //2.27 Fill the Mandatory Fields
        shoppingCart.selectFirstName("kavan");
        shoppingCart.selectLastName("Patel");
        shoppingCart.clearEmail();
        shoppingCart.selectEmail("xyz@yahoo.com");
        shoppingCart.selectCompanyAddress("ABC");
        shoppingCart.selectCountryId("United States");
        shoppingCart.selectStateProvinceId("California");
        shoppingCart.selectcity("London");
        shoppingCart.selectAddress1("Harrow");
        shoppingCart.selectPostalCode("ha3 8ew");
        shoppingCart.selectPhoneNumber("08473732");
        electronics.clickOnContinueTab8();
        // 	2.29 Click on Radio Button “2nd Day Air ($0.00)”
           electronics.clickOnRadioButton2ndDayAir();
        // 2.30 Click on “CONTINUE”
        electronics.clickOnContinue6();
        // 2.31 Select Radio Button “Credit Card”
           electronics.selectCreditCard();
           electronics.clickonContinue3();
        //2.32 Select “VISA” From Select credit card dropdown
        electronics.selectVisaCard("visa");
        //2.33 Fill all the Details
        shoppingCart.selectCardHolderName("kavan Patel");
        shoppingCart.selectCardNumber("5105105105105100");
        shoppingCart.selectExpireMonth("5");
        shoppingCart.selectExpireYear("2023");
        Thread.sleep(1000);
        shoppingCart.selectCardCode("392");

        //2.34 Click on “CONTINUE”
        electronics.clickOnContinue7();
        //2.35 Verify “Payment Method” is “Credit Card”
        String expectedMessage8 = "Credit Card";
        String actualMessage8 = shoppingCart.getVerifyCreditCard();
        Assert.assertEquals(expectedMessage8,actualMessage8,"Text verify");
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        electronics.getVerifyText2ndDayAir();

        //	2.37 Verify Total is “$698.00”
        electronics.getTotalPrice$698();
        //	2.38 Click on “CONFIRM”
        electronics.clickOnconfirm5();

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

        //2.43 Click on “Logout” link
        electronics.clickOnLogout();










    }
}