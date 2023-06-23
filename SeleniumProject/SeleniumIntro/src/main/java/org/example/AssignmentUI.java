package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssignmentUI {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-invalid")).sendKeys("Rich");
        driver.findElement(By.name("email")).sendKeys("tester@test.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Crocodile");
        driver.findElement(By.id("exampleCheck1")).click();
        Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
        WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(0);
        String selecteddropdown =  dropdown.getFirstSelectedOption().getText();
        System.out.println(selecteddropdown);
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.cssSelector("input.btn.btn-success")).click();
        System.out.println(driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText());
        //Assert.assertEquals((driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText()),"×" + "Success! The Form has been submitted successfully!.");
        driver.close();

    }
}
