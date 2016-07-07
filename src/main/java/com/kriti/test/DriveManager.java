package com.kriti.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Asus on 04/05/2016.
 */
public class DriveManager {
    public static WebDriver driver;
    public void openBrowser() throws FileNotFoundException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\configfile\\config.properties");
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {

        }
        String browser = properties.getProperty("browser");
        String url = properties.getProperty("url");

        driver= new FirefoxDriver();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
    public void closeBrowser(){
        driver.quit();
    }
}
