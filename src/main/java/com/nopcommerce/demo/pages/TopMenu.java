package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenu extends Utility {
    By computerLink = By.linkText("Computers");
    By electronicsLink = By.linkText("Electronics");
    By apparelLink = By.linkText("Apparel");
    By digitalDownloadsLink = By.linkText("Digital downloads");
    By booksLink = By.linkText("Books");
    By jewelryLink = By.linkText("Jewelry");
    By giftCardsLink = By.linkText("Gift Cards");
    By verifyComputer = By.xpath("//h1[text()='Computers']");
    By verifyElectronics = By.xpath("//h1[text()='Electronics']");
    By verifyApparel = By.xpath("//h1[text()='Apparel']");
    By verifyDigitalDownloads = By.xpath("//h1[text()='Digital downloads']");
    By verifyBooks = By.xpath("//h1[text()='Books']");
    By verifyJewelry = By.xpath("//h1[text()='Jewelry']");
    By verifyGiftCard = By.xpath("//h1[text()='Gift Cards']");

    public void clickOnComputerLink() {
        clickOnElement(computerLink);
    }

    public void clickOnElectronicsLink() {
        clickOnElement(electronicsLink);
    }

    public void clickOnApparelLink() {
        clickOnElement(apparelLink);
    }

    public void clickOnDigitalDownloadsLink() {
        clickOnElement(digitalDownloadsLink);
    }

    public void clickOnBooksLink() {
        clickOnElement(booksLink);
    }

    public void clickOnJewelryLink() {
        clickOnElement(jewelryLink);
    }

    public void clickOnGiftCardLink() {
        clickOnElement(giftCardsLink);
    }

    public String verifyComputerTextSuccessfully() {
        return getTextFromElement(verifyComputer);
    }

    public String verifyElectronicsTextSuccessfully() {
        return getTextFromElement(verifyElectronics);
    }

    public String verifyApparelTextSuccessfully() {
        return getTextFromElement(verifyApparel);
    }

    public String verifyDigitalDownloadsTextSuccessfully() {
        return getTextFromElement(verifyDigitalDownloads);
    }

    public String verifyBooksTextSuccessfully() {
        return getTextFromElement(verifyBooks);
    }

    public String verifyJewelryTextSuccessfully() {
        return getTextFromElement(verifyJewelry);
    }

    public String verifyGiftCardTextSuccessfully() {
        return getTextFromElement(verifyGiftCard);
    }

    public void selectMenu(String menu) {

         if (menu == "Computers") {
            clickOnComputerLink();
        } else if (menu == "Electronics") {
            clickOnElectronicsLink();
        } else if (menu == "Apparel") {
            clickOnApparelLink();
        } else if (menu == "Digital downloads") {
            clickOnDigitalDownloadsLink();
        } else if (menu == "Books") {
            clickOnBooksLink();
        } else if (menu == "Jewelry") {
            clickOnJewelryLink();
        } else if (menu == "Gift Cards") {
            clickOnGiftCardLink();
        }

    }
}