package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowactivities {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.navigate().to("https://www.rahulshettyacademy.com"); //Navigates on a window already during automation.
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();
    }
}
