package com.fcrm.qa.helpers;

import org.openqa.selenium.WebElement;

// Applicable only to INPUT and TEXTAREA elements
public class TextFieldHelper
{
    public static void clear(WebElement textField)
    {
        if (Helper.isActive(textField)) {
            textField.clear();
        } else {
            // TODO: Log textfield(text box) or textarea(multiline text box) is not active
        }
    }

    public static void sendKeys(WebElement textField, String keysToSend)
    {
        if (Helper.isActive(textField)) {
            clear(textField);
            textField.sendKeys(keysToSend);
        } else {
            // TODO: Log textfield or textarea is not active
        }

    }
}
