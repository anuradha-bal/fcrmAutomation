package com.fcrm.qa.helpers;

import org.openqa.selenium.WebElement;

public class Helper
{
    public static boolean isActive(WebElement element)
    {
        return isDisplayed(element) && isEnabled(element);
    }

    public static boolean isDisplayed(WebElement element)
    {
        return element.isDisplayed();
    }

    public static boolean isEnabled(WebElement element)
    {
        return element.isEnabled();
    }

    public static boolean isSelected(WebElement element)
    {
        return element.isSelected();
    }
}
