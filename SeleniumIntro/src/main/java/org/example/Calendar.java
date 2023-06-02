package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        options.addExtensions(new File("C:/Users/wild_/OneDrive/Desktop/cjpalhdlnbpafiamejdnhcphjbkeiagm/1.49.2_0.crx"));
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1100)");
        WebElement calendar = driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']"));
        Thread.sleep(3000);
        calendar.click();


        List<WebElement> dates =  driver.findElements(By.cssSelector(".flatpickr-day "));
        //Grab common attribute and put it into a list.

        WebElement month = driver.findElement(By.xpath("//div[@class='flatpickr-month']"));

       // while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("June"))
        while(!month.getText().contains("June"))
        {

           /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='flatpickr-next-month']")));*/
            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();

        }

        int count= driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();
        for(int i = 1;i<count;i++){
            Thread.sleep(2000);
            String text = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();
            if (text.equalsIgnoreCase("23")){
                driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
                System.out.println("The select day is:"+text);
                break;
            }

        }
    }
}
