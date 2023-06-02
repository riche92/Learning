package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class JavaStreamFilter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> vegetables = driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filteredList = vegetables.stream().filter(vegetable->vegetable.getText().contains("Rice"))
                .collect(Collectors.toList());
        Assert.assertEquals(vegetables.size(),filteredList.size());

    }
}
