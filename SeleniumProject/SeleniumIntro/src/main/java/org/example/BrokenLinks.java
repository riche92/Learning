package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        SoftAssert a = new SoftAssert();
        //broken URL
        //Step 1 - IS to get all urls tied to the links using selenium
        //Java methods will call URLS and get you status codes
        //If status code >400 then the url isnt working -> link which is broken
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        //String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
        WebElement footer = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
        List<WebElement> Links = footer.findElements(By.cssSelector("a"));
        //Enhanced for loop, For every element found in links it is put into the link object
        for (WebElement link : Links) {
            String url = link.getAttribute("href");
            HttpURLConnection connect = (HttpURLConnection) new URL(url).openConnection();//Return type is HttpURLConnection and casting it
            connect.setRequestMethod("HEAD");
            connect.connect();
            int respCode = connect.getResponseCode();
            System.out.println(respCode);
            a.assertTrue(respCode<400, "The link with Text " + link.getText()+" is broken with code " + respCode);
           /* if (respCode > 400) {
                System.out.println("The link with Text " + link.getText()+" is broken with code " + respCode);
                a.assertTrue(false);*/
            }
            a.assertAll();
        driver.quit();
        }
    }

