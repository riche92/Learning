package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowhandlingAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.cssSelector("a[href='/windows']")).click();
        driver.findElement(By.xpath("//div[@class='example']/a")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iter = windows.iterator();
        String parentId = iter.next();
        String childId = iter.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());
        driver.quit();

        //WebElement move = driver.findElement(By.cssSelector())


    }
}
