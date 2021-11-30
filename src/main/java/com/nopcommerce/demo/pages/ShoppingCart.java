package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By addToccart = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");
    By verifyBuidComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By pantiumDual = By.xpath("//select[@name='product_attribute_1']");
    By select8GB$60 = By.xpath("//select[@name='product_attribute_2']");
    By selectHDDRadio = By.xpath("//input[@id='product_attribute_3_7']");
    By vistaPremium$60 = By.xpath("//input[@id='product_attribute_4_9']");
    By microsoftOffice$50 = By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommander5 = By.xpath("//input[@id='product_attribute_5_12']");
    By price$1475 = By.xpath("//span[text()='$1,475.00']");
    By addedToYourShoppingcart = By.xpath("//p[@class='content']");
    By closeCrossButton = By.xpath("//span[@class='close']");
    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By gOTOCartButton = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changeQtyTo2 = By.xpath("//input[@class='qty-input']");
    By updateShoppingCart = By.xpath("//button[contains(text(),'Update shopping cart')]");
    By price$2950 = By.xpath("//tr[@class='order-total']//strong[text()='$2,950.00']");
    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    By textWelcomePleaseSignIn = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkoutAsGust = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailAddress = By.xpath("//input[@id='BillingNewAddress_Email']");
    By companyAddress = By.xpath("//input[@id='BillingNewAddress_Company']");
    By countryId = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By stateProvinceid = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By cityAddress = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickcontinue = By.xpath("//button[@onclick='Billing.save()']");
    By radioButton = By.xpath("//input[@id='shippingoption_1']");
    By clickContinue2 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By clickContinue3 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By masterCard = By.xpath("//select[@id='CreditCardType']");
    By cardholderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expireMonth = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continue4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By verifyCreditCard = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyNextDayAir = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By verifyTotal$2950 = By.xpath("//tr[@class='order-total']//strong[text()='$2,950.00']");
    By confirm = By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyOrderSuccessfully = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continue5 = By.xpath("//button[contains(text(),'Continue')]");
    By verifyWelcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickonaddToCart() {
        mouseHoverAndClickToElement(addToccart);
    }

    public String getVerifyBuildOwnComputerText() {
        return getTextFromElement(verifyBuidComputer);
    }

    public void selectPantiumDualCoreE2200(String value) {
        selectByvalueFromDropDown(pantiumDual, value);
    }

    public void setSelect8GB$60ect8GB$60(String value) {
        selectByvalueFromDropDown(select8GB$60, value);
    }

    public void clickOnSelectHDDRadio() {
        clickOnElement(selectHDDRadio);
    }

    public void clickOnSelectVistaPremium$60() {
        clickOnElement(vistaPremium$60);
    }

    public void selectMicrosoftOffice$50() {
        clickOnElement(microsoftOffice$50);
    }

    public void selectTotalCommander5() {
        clickOnElement(totalCommander5);
    }

    public String getVerifyPrice$1475() {
        return getTextFromElement(price$1475);
    }

    public String getVerifyAddedToYourShoppingcart() {
        return getTextFromElement(addedToYourShoppingcart);
    }

    public void clickoncloseCrossButton() {
        clickOnElement(closeCrossButton);
    }

    public void selectMouseHoverOnShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }

    public void selectGOTOCartButton() {
        clickOnElement(gOTOCartButton);
    }

    public String getVerifyShoppingCart() {
        return getTextFromElement(shoppingCart);
    }

    public void selectClearValue() {
        clearValue(changeQtyTo2);
    }


    public void selectChangeTheQty2(String value) {
        sendTextToElement(changeQtyTo2, value);
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String getVerifyPrice$2950() {
        return getTextFromElement(price$2950);
    }

    public void selectCheckboxIAgree() {
        clickOnElement(clickOnCheckbox);
    }

    public void clickCheckout() {
        clickOnElement(clickOnCheckout);
    }

    public String getVerifyWelcomePleaseSignIn() {
        return getTextFromElement(textWelcomePleaseSignIn);
    }

    public void clickOnGuest() {
        clickOnElement(checkoutAsGust);
    }

    public void selectFirstName(String text) {
        sendTextToElement(firstName, text);
    }

    public void selectLastName(String text) {
        sendTextToElement(lastName, text);
    }

    public void clearEmail(){clearValue(emailAddress);}
    public void selectEmail(String text) {
        sendTextToElement(emailAddress, text);
    }

    public void selectCompanyAddress(String text) {
        sendTextToElement(companyAddress, text);
    }

    public void selectCountryId(String text) {
        selectByVisibleTextFromDropDown(countryId, text);
    }

    public void selectStateProvinceId(String text) {
        selectByVisibleTextFromDropDown(stateProvinceid, text);
    }

    public void selectcity(String text) {
        sendTextToElement(cityAddress, text);
    }

    public void selectAddress1(String text) {
        sendTextToElement(address1, text);
    }

    public void selectPostalCode(String text) {
        sendTextToElement(postalCode, text);
    }

    public void selectPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);
    }

    public void selectContinue1() {
        clickOnElement(clickcontinue);
    }

    public void selectNextDayAir() {
        clickOnElement(radioButton);
    }

    public void clickOnContinue2() {
        clickOnElement(clickContinue2);
    }

    public void selectCreditCard() {
        clickOnElement(creditCard);
    }

    public void setClickContinue3() {
        clickOnElement(clickContinue3);
    }

    public void selectMasterCard(String name) {
        selectByvalueFromDropDown(masterCard, name);
    }

    public void selectCardHolderName(String name) {
        sendTextToElement(cardholderName, name);
    }

    public void selectCardNumber(String value) {
        sendTextToElement(cardNumber, value);
    }

    public void selectExpireMonth(String value) {
        selectByvalueFromDropDown(expireMonth, value);
    }

    public void selectExpireYear(String value) {
        selectByvalueFromDropDown(expireYear, value);
    }

    public void selectCardCode(String value) {
        sendTextToElement(cardCode, value);
    }

    public void clickonContinue4() {
        clickOnElement(continue4);
    }

    public String getVerifyCreditCard() {
        return getTextFromElement(verifyCreditCard);
    }

    public String getVerifyNextDayAir() {
        return getTextFromElement(verifyNextDayAir);
    }

    public String getVerifyTotal$2950() {
        return getTextFromElement(verifyTotal$2950);
    }

    public void clickOnConfirm1() {
        clickOnElement(confirm);
    }

    public String getVerifyThankYou() {
        return getTextFromElement(verifyThankYou);
    }

    public String getVerifyYourOrdersuccessfullyProcessed() {
        return getTextFromElement(verifyOrderSuccessfully);
    }

    public void clickOncontinue5() {
        clickOnElement(continue5);
    }
    public String getVerifyWelcomeToOurStore(){return getTextFromElement(verifyWelcomeToOurStore);}
}