package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
        System.out.println(driver.findElements(By.tagName("frame")).size());
        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
        System.out.println(driver.findElement(By.cssSelector("div[id=content]")).getText());

    }
}
