package com.fcrm.qa.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHelper
{
    public static void selectByIndex(WebElement dropdown, int idx)
    {
        if (Helper.isActive(dropdown)) {
            Select item = new Select(dropdown);
            item.selectByIndex(idx);
        } else {
            // TODO: Log dropdown is not active
        }
    }

    public static void selectByValue(WebElement dropdown, String value)
    {
        if (Helper.isActive(dropdown)) {
            Select item = new Select(dropdown);
            item.selectByValue(value);
        } else {
            // TODO: Log dropdown is not active
        }
    }

    public static void selectByVisibleText(WebElement dropdown, String visibleText)
    {
        if (Helper.isActive(dropdown)) {
            Select item = new Select(dropdown);
            item.selectByVisibleText(visibleText);
        } else {
            // TODO: Log dropdown is not active
        }
    }

    public static void setByVisibleText(List<WebElement> dropdowns, String visibleText)
    {
        // Used for controls with span
        if (dropdowns == null || dropdowns.size() == 0) {
            return;
        }
        for (WebElement item : dropdowns) {
            if (item.getText().equals(visibleText)) {
                item.click();
                break;
            }
        }
    }

}
