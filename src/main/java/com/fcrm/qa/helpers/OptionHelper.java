package com.fcrm.qa.helpers;

import org.openqa.selenium.WebElement;

// Applicable for checkbox and option(radio button)
public class OptionHelper
{
    public static void optionClick(WebElement checkbox)
    {
        if (Helper.isActive(checkbox)) {
            checkbox.click();
        } else {
            // TODO: Log checkbox or radio button is not active
        }
    }
}
