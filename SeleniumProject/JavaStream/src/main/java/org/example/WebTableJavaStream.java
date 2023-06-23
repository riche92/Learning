package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class WebTableJavaStream {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //click on column
        //Capture all webelements into list and get text
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> products = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originalList = products.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(originalList.equals(sortedList));


        List<String> Beans = products.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s))
                .collect(Collectors.toList());
        Beans.forEach(s->System.out.println(s));
        List<String> Rice;
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            Rice = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
                    .collect(Collectors.toList());
            Rice.forEach(s -> System.out.println(s));
            if (Rice.size() < 1) {
                driver.findElement(By.xpath("//a[@aria-label='Next']")).click();

            }
        }
            while (Rice.size() < 1);


    }

    private static String getPriceVeggie(WebElement s) {
        //We are already in Webelement S so we dont need driver.findelement, we can use s here.
       String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return value;

    }
}
