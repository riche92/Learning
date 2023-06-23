package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Shoppingcart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String vegetables[] = {"Brocolli", "Cucumber", "Beetroot","Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Methods a = new Methods();
        a.addItems(driver,vegetables);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(),"Code applied ..!");

        //driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy"); (cssSelector code)
       // driver.close();
    }
}
