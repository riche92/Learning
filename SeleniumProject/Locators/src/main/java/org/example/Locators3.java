package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://www.rahulshettyacademy.com");
        driver.findElement(By.linkText("Practice")).click();
        driver.findElement(By.cssSelector("input[placeholder='Your Name']")).sendKeys("Rich");
        driver.findElement(By.id("email")).sendKeys("test@test.com");*/
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
        driver.close();

        /* The following goes from Practice button to the sibling button of login
        //header/div/button[1]/following-sibling::button[1]
        //header/div/button[1]/parent::div/parent::header/a for parent

        //li[@name='item1']/following-sibling::li
        */
    }
}
