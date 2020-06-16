package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InvoicePage extends LoginPage {
     public InvoicePage(){
         PageFactory.initElements(Driver.get(),this);
     }

     @FindBy(xpath = "//thead//th[3]")
     public WebElement MainTable;

     @FindBy(xpath = "(//span[@class='oe_menu_text'])[9]")
     public WebElement InvoiceModule;

    @FindBy(xpath = "//thead//th")
    public List<WebElement> theads;








}
