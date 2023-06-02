package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class SyncMethodsAssign {
    public static void login(WebDriver driver){
        driver.findElement(By.id("username")).sendKeys(driver.findElement(By.xpath("//p[@class='text-center text-white']/b[1]/i")).getText());
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");
        driver.findElement(By.xpath("//*[@class='customradio'][2]")).click();
       // driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.cssSelector("button[id='okayBtn']")).click();
        WebElement staticdropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(2);
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
    }

    public static void shoppingCart(WebDriver driver){
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']/a"));
        for(int i = 0; i < products.size(); i++){
            driver.findElements(By.cssSelector("button.btn-info")).get(i).click();
        }
        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
    }

}

