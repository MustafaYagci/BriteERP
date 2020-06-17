package com.briteerp.stepdefinitions;

import com.briteerp.pages.InvoicePage;
import com.briteerp.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class InvoiceStepDefs {
    InvoicePage IP = new InvoicePage();


    @Given("user should be able to log in the application")
    public void user_shoul_be_able_to_log_in_the_application(){
          IP.Login();
    }

    @And("user should able to click invoice module")
    public void user_shoul_be_able_to_click_invoice_module() throws Exception{

        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(IP.InvoiceModule));
        IP.InvoiceModule.click();


    }

    @Then("Verify that user should able to see the table of customer invoices")
    public void verify_that_user_should_able_to_see_the_table_of_customer_invoices() {

        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.visibilityOf(IP.MainTable));
        Assert.assertTrue(IP.MainTable.isDisplayed());

    }

    @Then("Verify that table headers are contains")
    public void verify_that_table_headers_are_contains(List<String> expected) {
        List<String> actual= new ArrayList<>();
        for(WebElement each: IP.theads){
            actual.add(each.getText());
        }
        for(int i=0; i<expected.size(); i++){

            for(String each:actual){
                if (expected.get(i).equals(each)){
                    Assert.assertEquals(expected.get(i),each);
                }
            }
        }
    }

    @Then("Veify that {int} small buttons are displayed down of the search box")
    public void veify_that_small_buttons_are_displayed_down_of_the_search_box(int expected) {
          int actual= IP.small5Button.size();
        Assert.assertEquals("The number of buttons are not expected",expected,actual);
    }

    @Then("Verify that page header is {string}")
    public void verify_that_page_header_is(String expected) {
        String actual = Driver.get().getTitle();
        Assert.assertEquals("The page title is not same",expected,actual);
    }

    @When("Verify that radio buttons are clickable")
    public void verify_that_radio_buttons_are_clickable() throws Exception {
      WebElement checkBox= IP.tableCheckBox(8);
      checkBox.click();
      //Thread.sleep(1000);
      WebDriverWait wait = new WebDriverWait(Driver.get(),20);

      wait.until(ExpectedConditions.visibilityOf(Driver.get().findElement(By.xpath("(//button[@aria-expanded='false'])[1]"))));
      Assert.assertTrue(Driver.get().findElement(By.xpath("(//button[@aria-expanded='false'])[1]")).isDisplayed());

    }

    @When("Verify that {string} and {string} buttons are displayed")
    public void verify_that_and_buttons_are_displayed(String string, String string2) {
        ArrayList<String> actual= new ArrayList<>();
        for (WebElement each: IP.CreateImport){
            actual.add(each.getText());
        }

        if(actual.contains(string) || actual.contains(string2)){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }

    }

    @Then("Verify that user should able to click {string}")
    public void verify_that_user_should_able_to_click(String string) {

    }

    @Given("Verify that user should able to see {string} {string} {string} buttons")
    public void verify_that_user_should_able_to_see_buttons(String string, String string2, String string3) {

    }

    @Given("Verify that {string} and {string} are displayed under {string}")
    public void verify_that_and_are_displayed_under(String string, String string2, String string3) {

    }

    @Then("Verify that {int} link displayed under Documents")
    public void verify_that_link_displayed_under_Documents(Integer int1) {

    }







}
