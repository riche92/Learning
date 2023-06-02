package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000); //Explicit waiting is better than sleeping
        //Because there is a link linktext works so you can use the above to find the locator
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rich");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("richardeng1892@gmail.com");
       /* driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("johnson");*/
        //U can only do it in array on xpath
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("richard@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("4445556666");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());//This is parent child CSS
        //driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        //driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'logout')]")).click();
        driver.quit();
    }

}

/*
<input type="text" placeholder="Username" id="inputUsername>
CSS Selector -
Class name -> tagname.classname
Id -> tagname#id -> input#inputUsername
input[placeholder='Username']
$("p.error") for console for cssSelector, p is the tagname and error is the classname

XPath -
//Tagname[@attribute='value']
//input[@placeholder='Name']
$x('//input[@placeholder="Name"]') in console to see if its unique
To do from parent -> //form/input[3]  (form and h2 are tagnames of the html) (//parenttagname/childtagname[#ofchild]
 */
