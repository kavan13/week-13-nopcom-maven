package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComputerMenu extends Utility {
    By computerlink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");
    By desktoplink  = By.xpath("//div[@class='category-grid sub-category-grid']//a[text()=' Desktops ']");
    By sortbyposition = By.xpath("//select[@id='products-orderby']");
    By verifyZToA = By.xpath("//h2[@class='product-title']");

    public void clickOnComputerlink(){
        clickOnElement(computerlink);
    }
    public void clickOnDesktoplink(){
        clickOnElement(desktoplink);
    }
    public void clickOnSortByPosition(int value){
        selectByIndexFromDropDown(sortbyposition,value);
    }
    public WebElement VerifyProductArrangeInZtoA(){
        return getListFromElement(verifyZToA);
    }
}
