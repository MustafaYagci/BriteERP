package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button")
    public List<WebElement> small5Button;

   public WebElement tableCheckBox(int rowNum){
       return Driver.get().findElement(By.xpath("//table/tbody/tr["+rowNum+"]/td[1]"));
   }

   @FindBy(xpath = "//div[@class='o_list_buttons']//button")
   public List<WebElement> CreateImport;







}
