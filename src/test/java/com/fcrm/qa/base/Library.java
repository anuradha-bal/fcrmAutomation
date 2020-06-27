package com.fcrm.qa.base;

import com.fcrm.qa.utilities.SeleniumUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library
{
    private static SeleniumUtility seleniumutility;
    private static WebDriver driver;
    private static Properties prop;

    public static SeleniumUtility getSeleniumUtility()
    {
        return seleniumutility;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public static Properties getProp()
    {
        return prop;
    }

    public void launchApplication()
    {
        try {
            FileInputStream fis = new FileInputStream("src/test/java/com/crm/qa/config/config.properties");
            prop = new Properties();
            prop.load(fis);

            // Read from config file
            String browser = prop.getProperty("browser");
            String url = prop.getProperty("url");
            int implicitWait = Integer.parseInt(prop.getProperty("implicit-wait"));

            if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.iedriver().setup();
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equals("headless")) {
                driver = new HtmlUnitDriver();
            } else {
                System.out.println("only chrome, ie  and headless browsers are supported");
                // TODO: Add to Log file and throw exception
                return;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
            driver.get(url);

            seleniumutility = new SeleniumUtility(driver);
        } catch (WebDriverException e) {
            // TODO: Add to Log file
            System.out.println("Browser could not be launched : " + e.toString());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO: Add to Log file
            System.out.println("File not found : " + e.toString());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception : " + e.toString());
            e.printStackTrace();
        }
    }

    public void quit()
    {
        driver.quit();
    }
}