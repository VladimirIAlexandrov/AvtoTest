package org.example;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Master {

    public static void test(String NameUser, String Password_User) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        HelperMethods test = new HelperMethods(driver);

        test.open("https://www.saucedemo.com/");
        test.DisplayedLogin();
        test.Login(NameUser, Password_User);
        test.LoginCheck();
        test.ProductsCheck();
        test.EnabledBasket();
        test.EnableButton();
        test.displayed_prod();
        test.displayed_sort();
        test.BasketSchet("6");
        test.ButtonRemoveCheck();
        test.sort();
        test.MenuButtonS();
        test.LogoutCheck();
        test.QuitDriver();
    }

    public static void test1(String NameUser, String Password_User) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        HelperMethods test = new HelperMethods(driver);

        test.open("https://www.saucedemo.com/");
        test.DisplayedLogin();
        test.Login(NameUser, Password_User);
        test.LoginCheck();
        test.ProductsCheck();
        test.EnabledBasket();
        test.displayed_prod();
        test.displayed_sort();
        test.ClickADD();
        test.ClickBasket();
        test.ClickRemove();
        test.ClickLogout();
        test.QuitDriver();
    }
}