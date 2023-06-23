package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Synchronization {
    /*
    Implicit Wait: Wait for n number of seconds before you throw exception
    -Defining Globally
    Readable code
    Cons: Performance issues are not caught if the timer is set high

    Explicit Wait:
    -Wait is applied Specific to element (Like for hotel search which requires backend to load)

    WebdriverWait w = new WebdriverWait();
    Cons: More code
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
