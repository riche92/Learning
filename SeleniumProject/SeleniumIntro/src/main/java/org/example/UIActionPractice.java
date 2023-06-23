package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static java.util.concurrent.TimeUnit.SECONDS;

public class UIActionPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        /*driver.get("https://www.rahulshettyacademy.com/practice-project");
        driver.findElement(By.linkText("Practice"));*/
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        //driver.findElement(By.xpath("//a[@value='BLR'][1]")).click();
        driver.findElement((By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']"))).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        //dropdown with select tag (argument is where to find the select) SELECT are ALL static dropdowns
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        String selectedoption3 = dropdown.getFirstSelectedOption().getText();
        System.out.println(selectedoption3);
        Assert.assertEquals(selectedoption3, "USD");
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i = 1; i < 4; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        int b = 1;
        while (b<5)
        {
            driver.findElement(By.id("hrefIncChd")).click();
            b++;
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult, 4 Child");
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        //driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
       //driver.close();

    }
}
