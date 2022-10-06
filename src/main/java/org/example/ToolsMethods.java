package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ToolsMethods {

    public static void ProductCheck(String XPath, String Text) {
        WebElement inventory_text = HelperMethods.GetElement(XPath);
        displayed_text(inventory_text, Text);
    }

    public static boolean isClickable(WebElement el, WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
            wait.until(ExpectedConditions.elementToBeClickable(el));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void displayed_text(WebElement el, String text) {
        String text1 = el.getText();
        if (text1.equals(text)) {
            Assert.assertTrue(true, text1+" отображается");
        }
        else{
            Assert.assertFalse(false, text1+" не отображается");
        }
    }

}
