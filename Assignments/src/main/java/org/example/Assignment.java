package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Assignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickacademy.com/practice.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement checked = driver.findElement(By.id("checkBoxOption2"));
        checked.click();
        String Selected =driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"))
                .getText();
        WebElement staticdropdown = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
        Select dropdownexample = new Select(staticdropdown);
        dropdownexample.selectByVisibleText(Selected);
        driver.findElement(By.id("name")).sendKeys(Selected);
        driver.findElement(By.id("alertbtn")).click();
        String alerttext = driver.switchTo().alert().getText();
        if(alerttext.contains(Selected)){
            System.out.println("Alert Success");
        }
        else {
            System.out.println("Alert failed");
        }
        driver.switchTo().alert().accept();
        driver.quit();
        //Assert.assertEquals(alerttext,"Hello Option2, share this practice page and share your knowledge");


    }
}
