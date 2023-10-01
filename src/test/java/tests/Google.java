package tests;

import com.github.javafaker.Faker;
import com.google.common.annotations.VisibleForTesting;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import utilities.Driver;

import java.sql.SQLOutput;

public class Google {


    @Test
    public void seach () {
        Faker faker = new Faker();
        String testData = faker.lorem().word();
        Driver.setDriver("chrome").get("https://google.com");
        Driver.setDriver("chrome").findElement(By.name("q")).sendKeys(testData + Keys.ENTER);
        String title = Driver.setDriver("chrome").getTitle();
        Assert.assertTrue("it is failed", title.contains(testData));
    }

    public void googleImage (){
        Driver.setDriver("chrome").get("https://google.com");
        System.out.println("checking some images");
            }
            ////mmmm
}
