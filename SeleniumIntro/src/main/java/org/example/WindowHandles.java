package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandles {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector(".blinkingText")).click();
            Set<String> windows = driver.getWindowHandles(); //[parentid,childid]
            Iterator<String> it = windows.iterator();
            String parentId = it.next();
            String childId = it.next();
            driver.switchTo().window(childId);
            driver.findElement(By.cssSelector(".im-para.red")).getText();
            String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
            driver.close();
            driver.switchTo().window(parentId);
            driver.findElement(By.id("username")).sendKeys(email);
        }
    }
