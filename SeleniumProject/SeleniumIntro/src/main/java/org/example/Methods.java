package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Methods {

    public void addItems(WebDriver driver, String vegetables[]) {
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {

            //Broccoli = 1 Kg
            String name[] = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            //format it to get actual vegetable name


            // Convert array into array list for easy search
            // check whether vegetables extracted is present in arraylist or not
            List vegetablesNeeded = Arrays.asList(vegetables);

            //if (name.contains("Cucumber"){
            int j = 0;
            if (vegetablesNeeded.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                j++;
                //length is size of array
                //size is length of arraylist
                if (j == vegetables.length) {
                    break;
                }

            }
        }
    }
}

