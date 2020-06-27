package com.fcrm.qa.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class SeleniumUtility
{
    WebDriver driver;

    public SeleniumUtility(WebDriver driver)
    {
        this.driver = driver;

    }

    public void takeScreenshot(String fileName)
    {
        if (driver instanceof TakesScreenshot) {
            saveScreen(fileName);
        } else {
            System.out.println("Screenshot cannot be taken: driver " + driver.getClass().getName() + " does not support screenshooting");
        }
    }

    public void explicitlyWait(String Locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
    }

    private void saveScreen(String fileName)
    {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            Thread.sleep(3000);
            FileUtils.copyFile(source, new File("src/test/resources/Screenshots/" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
