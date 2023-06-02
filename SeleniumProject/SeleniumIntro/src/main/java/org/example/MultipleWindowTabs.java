package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindowTabs {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice");
        //Window Switch
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> Windows = driver.getWindowHandles();
        Iterator<String> it = Windows.iterator();
        String startwindow = it.next();
        String nextwindow = it.next();
        driver.switchTo().window(nextwindow);
        driver.navigate().to("https://rahulshettyacademy.com");
        String name = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        driver.switchTo().window(startwindow);
        WebElement Nameinput = driver.findElement(By.cssSelector("input[name='name']"));
                Nameinput.sendKeys(name);
                //Screenshot
           File file =  Nameinput.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("local.png"));
        //Get Height and width
        System.out.println(Nameinput.getRect().getDimension().getHeight());
        System.out.println(Nameinput.getRect().getDimension().getWidth());
        driver.quit();

    }
}
