package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class chromeOptions {
    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        options.addExtensions(new File("C:/Users/wild_/OneDrive/Desktop/cjpalhdlnbpafiamejdnhcphjbkeiagm/1.49.2_0.crx"));
/*        To get the CRX file, I needed to get to the extension folder, make a copy on desktop and then unpack it via
        chrome://extensions using the folder*/
        System.setProperty("webdriver.chrome.driver", "/Users/wild_/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
                /*Proxy proxy = new Proxy();
                proxy.setHttpProxy("ipaddress:4444");
                options.setCapability("proxy", proxy);*/
            driver.get("https://google.com");
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("C://Users/wild_/OneDrive/Documents/ScreenshotTest.png"));


        }
    }
