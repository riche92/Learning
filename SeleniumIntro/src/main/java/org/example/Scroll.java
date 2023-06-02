package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // You can execute on console in browser with "window.scrollBy(horizontal,vertical)"
        js.executeScript("window.scrollBy(0,500)");
        // You can select inside scrollbox with document.querySelector(".tableFixHead") in console
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

       List<WebElement> values =  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;

       for (int i = 0; i < values.size(); i++)
       {
           sum = sum + Integer.parseInt(values.get(i).getText()); //The number in values is turned into String at first
           // and then we parseInt to turn it into a integer
       }
        System.out.println(sum);
       int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

        Assert.assertEquals(sum,total);

    }
}
