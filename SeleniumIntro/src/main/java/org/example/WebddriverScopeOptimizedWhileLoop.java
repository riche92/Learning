package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebddriverScopeOptimizedWhileLoop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions a = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footer = driver.findElement(By.cssSelector("div[id='gf-BIG']")); //Limiting Webddriver scope

        System.out.println(footer.findElements(By.tagName("a")).size());

        WebElement columndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        for (int i = 1;i < columndriver.findElements(By.tagName("a")).size(); i++){
            String ctrlclick = Keys.chord(Keys.CONTROL,Keys.ENTER);

            columndriver.findElements(By.tagName("a")).get(i).sendKeys(ctrlclick);

        }
        Set<String> abc = driver.getWindowHandles();//count will be 4 windows
        Iterator<String> it = abc.iterator();
        while(it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        } //asking if any window is present*/
    }
}
