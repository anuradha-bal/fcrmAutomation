package com.fcrm.qa.helpers;

import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePickerHelper
{
    public static void datePicker(List<WebElement> dates, String date)
    {
        if (dates == null || dates.size() == 0) {
            return;
        }
        for (WebElement dateCell : dates) {
            if (dateCell.getText().equals(date)) {
                dateCell.click();
                break;
            }
        }
    }
}
