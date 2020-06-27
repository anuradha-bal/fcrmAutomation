package com.fcrm.qa.helpers;

import org.openqa.selenium.WebElement;

public class ButtonHelper
{
    public static void click(WebElement button)
    {
        if (Helper.isActive(button)) {
            button.click();
        } else {
            // TODO: Log button is not active
        }

    }

    public static void submit(WebElement button)
    {
        if (Helper.isActive(button)) {
            button.submit();
        } else {
            // TODO: Log button is not active
        }
    }
}
