package com.briteerp.pages;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;

public class LoginPage {

    public static void Login(){
        
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("login")).sendKeys(ConfigurationReader.get("username"));
        Driver.get().findElement(By.id("password")).sendKeys(ConfigurationReader.get("password"));
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
