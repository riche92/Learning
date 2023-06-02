package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoCompleteAssignment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("United");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("ul[id='ui-id-1'] div"));
        for (WebElement option : options) {
            if (option.getText().contains("United States")) {
                option.click();
                break;
            }
        }
    }
}
