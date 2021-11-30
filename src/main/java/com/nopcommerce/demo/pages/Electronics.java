package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By hoverOnElectronics = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
    By mouseHoverOnCellPhonesAndClick = By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By verifyTextCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab= By.xpath("//a[contains(text(),'List')]");
    By productnameNokiaLumia1020link = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By TextNokiaLumia1020 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By price$349 = By.xpath("//span[contains(text(),'$349.00')]");
    By changeQuantityTo2 = By.xpath("//input[@class='qty-input']");
    By addToCartTab = By.xpath("//button[@class='button-1 add-to-cart-button']");
    By productHasBeenAddedToYourShoppingCart= By.xpath("//p[@class='content']");
    By closeTheGreenBar=By.xpath("//span[@title='Close']");
    By mouseHoverOnShoppingCart1=By.xpath("//span[@class='cart-label']");
    By goToCartButton=By.xpath("//button[contains(text(),'Go to cart')]");
    By verifyMessageShoppingcart=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By verifyTotal$698=By.xpath("//span[@class='product-subtotal']");
    By checkbox=By.xpath("//input[@id='termsofservice']");
    By clickToCheckout=By.xpath("//button[@id='checkout']");
    By verifyTextWelcomePleaseSignIn=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By registerTab=By.xpath("//a[@class='ico-register']");
    By verifyTextRegister=By.xpath("//h1[contains(text(),'Register')]");
    By firstname=By.xpath("//input[@id='FirstName']");
    By lastName=By.xpath("//input[@id='LastName']");
    By email=By.xpath("//input[@id='Email']");
    By password=By.xpath("//input[@id='Password']");
    By confirmpassword=By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//button[@id='register-button']");
    By verifyMessageYourRegistrationCompleted=By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueTab1=By.xpath("//a[@class='button-1 register-continue-button']");
    By continueTab8 = By.xpath("//button[@onclick='Billing.save()']");
    By radioButton2ndDayAir=By.xpath("//input[@id='shippingoption_2']");
    By clickonContinue3=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By radioButtonCreditCard=By.xpath("//input[@id='paymentmethod_1']");
    By continueButton3=By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By visaCard=By.xpath("//select[@id='CreditCardType']");
    By continue7=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By verifyText2ndDayAir=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By totalPrice$698=By.xpath("//tr[@class='order-total']//strong[text()='$698.00']");
    By confirm=By.xpath("//button[contains(text(),'Confirm')]");
    By logout=By.xpath("//a[contains(text(),'Log out')]");



    public void mouseHoverOnElectronicsTab(){mouseHoverToElement(hoverOnElectronics);}
    public void selcectMouseHoverOnCellPhonesAndClick(){mouseHoverAndClickToElement(mouseHoverOnCellPhonesAndClick);}
    public String getVerifyTextCellPhones() {return getTextFromElement(verifyTextCellPhones);}
    public void clickOnListViewTab(){clickOnElement(listViewTab);}
    public void clickonproductnameNokiaLumia1020link(){clickOnElement(productnameNokiaLumia1020link);}
    public String getverifyTheTextNokiaLumia1020(){return getTextFromElement(TextNokiaLumia1020);}
    public String getverifyThePrice$349(){return getTextFromElement(price$349);}
    public void clearValue1(){clearValue(changeQuantityTo2);}
    public void setChangeQuantityTo2(String value){sendTextToElement(changeQuantityTo2,value);}
    public void clickOnADDTOCARTTab(){clickOnElement(addToCartTab);}
    public String getVerifyTextproductHasBeenAddedToYourShoppingCart(){return getTextFromElement(productHasBeenAddedToYourShoppingCart);}
    public void closeTheCrossGreenBar(){clickOnElement(closeTheGreenBar);}
    public void selectMouseHoverOnShoppingCart(){mouseHoverToElement(mouseHoverOnShoppingCart1);}
    public void clickOnGoToCartButton(){clickOnElement(goToCartButton);}
    public String getVerifyMessageShoppingcart(){return getTextFromElement(verifyMessageShoppingcart);}
    public String getVerifyTotal$698(){return getTextFromElement(verifyTotal$698);}
    public void clickOnCheckBoxIAgree(){clickOnElement(checkbox);}
    public void clickOnCheckout(){clickOnElement(clickToCheckout);}
    public String getverifyTextWelcomePleaseSignIn(){return getTextFromElement(verifyTextWelcomePleaseSignIn);}
    public void clickOnRegisterTab(){clickOnElement(registerTab);}
    public String getVerifyTextRegister(){return getTextFromElement(verifyTextRegister);}
    public void typeFirstName(String name){sendTextToElement(firstname,name);}
    public void typeLastName(String name){sendTextToElement(lastName,name);}
    public void typeEmail(String id){sendTextToElement(email,id);}
    public void typePassword(String text){sendTextToElement(password,text);}
    public void typeConfirmPassword(String text){sendTextToElement(confirmpassword,text);}
    public void clickRegisterButton1(){clickOnElement(registerButton);}
    public String getverifyMessageYourRegistrationCompleted(){return getTextFromElement(verifyMessageYourRegistrationCompleted);}
    public void clickOnContinueTab1(){clickOnElement(continueTab1);}
    public void clickOnContinueTab8(){clickOnElement(continueTab8);}
    public void clickOnRadioButton2ndDayAir(){clickOnElement(radioButton2ndDayAir);}
    public void clickOnContinue6(){clickOnElement(clickonContinue3);}
    public void selectCreditCard(){clickOnElement(radioButtonCreditCard);}
    public void clickonContinue3(){clickOnElement(continueButton3);}
    public void selectVisaCard(String value){selectByvalueFromDropDown(visaCard, value);}
    public void clickOnContinue7(){clickOnElement(continue7);}
    public String getVerifyText2ndDayAir(){return getTextFromElement(verifyText2ndDayAir);}
    public String getTotalPrice$698(){return  getTextFromElement(totalPrice$698);}
    public void clickOnconfirm5(){clickOnElement(confirm);}
    public void clickOnLogout(){clickOnElement(logout);}














}
