package com.briteerp.pages;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

public class LoginPage {

    public void Login(){

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("login")).sendKeys(ConfigurationReader.get("username"));
        Driver.get().findElement(By.id("password")).sendKeys(ConfigurationReader.get("password"), Keys.ENTER);


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
