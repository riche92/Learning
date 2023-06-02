package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsIntro {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/ref=nav_logo");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Actions a = new Actions(driver);//Driver will get actions capabilities
        WebElement move = driver.findElement(By.id("nav-link-accountList"));
        a.moveToElement(move).contextClick().build().perform();
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
                .keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    }
}
