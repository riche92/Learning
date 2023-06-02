package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebTablesAssignment {
    public static void main(String[] args) {
        /*
        Print how many rows in table
        Print how many columns
        Print second row information
         */
        System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".table-display")));
        System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
        System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());
        List<WebElement> Info = driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
        for (int i = 0; i<Info.size();i++ )
        {
            System.out.println(Info.get(i).getText());
        }
    }
    }
