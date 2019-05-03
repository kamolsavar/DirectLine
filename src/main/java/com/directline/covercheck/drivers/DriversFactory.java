package com.directline.covercheck.drivers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriversFactory {

    public static WebDriver driver;

    public void openBrowser(){
        System.setProperty("webDriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
        driver= new ChromeDriver();
    }

    public void navigate(String url){
        driver.get(url);
    }

    public String getTitle(){
        return driver.getTitle();
    }
    public void maximize(){
        driver.manage().window().maximize();
    }

    public void appplyImplicitWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.quit();
    }




}
