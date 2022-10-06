package org.example;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;
public class HelperMethods {
private static WebDriver driver;
    /**/
    public HelperMethods(WebDriver driver) {

        this.driver = driver;

    }

    public void open(String url) {
        driver.get(url);
    }

    public void Login(String NameUser, String Password_User) throws InterruptedException {

        WebElement UserName = GetElement("//*[@id='user-name']");
        WebElement password = GetElement("//*[@id=\'password\']");
        WebElement login_button = GetElement("//*[@id=\'login-button\']");

        UserName.sendKeys(NameUser);
        password.sendKeys(Password_User);
        login_button.click();
    }

    public void QuitDriver() throws InterruptedException {
        //Thread.sleep(5000L);
        driver.quit();
    }

    @Step("Проверить видимости заголовка'Products'")
    public void displayed_prod() {
        ToolsMethods.ProductCheck("//*[@id=\"header_container\"]/div[2]/span", "Products");
    }
    @Step("Проверить видимости кнопки 'Name (A to Z)'")
    public void displayed_sort() {
        ToolsMethods.ProductCheck("//*[@id=\"header_container\"]/div[2]/div[2]/span/span", "Name (A to Z)");
    }

    public void DisplayedLogin(){
        ToolsMethods.ProductCheck("//*[@id=\"user-name\"]", "Username");
        ToolsMethods.ProductCheck("//*[@id=\"password\"]", "Password");
        ToolsMethods.ProductCheck("//*[@id=\"login-button\"]", "LOGIN");
    }
    @Step("Проверить авторизацию")
    public void LoginCheck(){

        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {

            Assert.fail(" Ошибка авторизацииEpic sadface: Sorry, this user has been locked out.");
        };
    }

    @Step("Проверить страницу Products")
    public void ProductsCheck() {

        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[1]","Sauce Labs Backpack");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[2]","Sauce Labs Bike Light");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[3]","Sauce Labs Bolt T-Shirt");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[4]","Sauce Labs Fleece Jacket");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[5]", "Sauce Labs Onesie");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[6]","Test.allTheThings() T-Shirt (Red)");


        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[1]", "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[2]", "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[3]", "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[4]", "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[5]", "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[6]", "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");


        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[1]","$29.99");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[2]","$9.99");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[3]","$15.99");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[4]","$49.99");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[5]","$7.99");
        ToolsMethods.ProductCheck("(//*[@class=\"inventory_item\"])[6]","$15.99");
    }
    @Step("Проверка кнопок 'Add to cart'")
    public void EnableButton() {
        WebElement button = GetElement("//*[starts-with(text(), 'Add to cart')]");
        List<WebElement> buttonS = button.findElements(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        //System.out.println(buttonS.size());

        for (int i = 0; i < buttonS.size(); i++) {
            buttonS.get(i).click();
            String strI = "" + i;
            if (ToolsMethods.isClickable(buttonS.get(i), driver) == true) {
                Assert.fail("данная кнопка не активна " + strI);
            }
            else {
                Assert.assertTrue(true, "данная кнопка активна" + strI);
            }
        }
    }
    @Step("Проверка кнопок 'Remove'")
    public void ButtonRemoveCheck() {
        WebElement button1 = GetElement("//*[starts-with(text(), 'Remove')]");
        List<WebElement> buttonS1 = button1.findElements(By.xpath("//*[starts-with(text(), 'Remove')]"));
        //System.out.println(buttonS1.size());

        for (int i = 0; i < buttonS1.size(); i++) {
            buttonS1.get(i).click();
        }
        BasketSchet("");
    }

    @Step("Проверка кнопки корзины")
    public void EnabledBasket() {
        WebElement button = GetElement("//*[@id=\"shopping_cart_container\"]");

        if (ToolsMethods.isClickable(button, driver) == true) {
            Assert.assertTrue(true, "данная кнопка активна" );
        }
        else {
            Assert.fail("данная кнопка не активна");
        }
    }

    @Step("Проверка счетчика корзины")
    public void BasketSchet(String num) {
        WebElement number_r = GetElement("//*[@id=\"shopping_cart_container\"]");
        if (number_r.getText().equals(num)){
            Assert.assertTrue(true, "У корзины отобразился счетчик с" + number_r.getText());
        }
        else {
            Assert.fail("У корзины отобразился неверный счетчик "+ number_r.getText());
        }
    }

    public  void sort1() {
        WebElement button_Z_A1 = GetElement("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]");
        button_Z_A1.click();
    }

    @Step("Проверка сортировки")
    public  void sort() throws InterruptedException {

        String[] array = {"Test.allTheThings() T-Shirt (Red)", "Sauce Labs Onesie", "Sauce Labs Fleece Jacket", "Sauce Labs Bolt T-Shirt", "Sauce Labs Bike Light", "Sauce Labs Backpack"};
        WebElement button_Z_A1 = GetElement("//option[@value=\"za\"]");
        button_Z_A1.click();
        String[] array1 = new String[7];
        WebElement number_r1;
        int i=1;
        for(int j=0;j<6;j++){
            number_r1 = GetElement("/html/body/div/div/div/div[2]/div/div/div/div["+i+"]/div[2]/div[1]/a/div");
            array1[j]=number_r1.getText();
            i++;
        }

        for(i=0;i<6;i++) {
            if(array[i].equals(array1[i])){
                Assert.assertTrue(true, "Сортировка работает");
            }
            else{
                Assert.fail("Сортировка не работает");
            }
        }
    }
    @Step("Проверка меню")
    public void MenuButtonS() {
        WebElement button_menu1 = GetElement("//*[@id=\"menu_button_container\"]/div/div[1]/div");
        button_menu1.click();
        ToolsMethods.ProductCheck("//*[@id=\"inventory_sidebar_link\"]","ALL_ITEMS");
        ToolsMethods.ProductCheck("//*[@id=\"about_sidebar_link\"]","ABOUT");
        ToolsMethods.ProductCheck("//*[@id=\"logout_sidebar_link\"]","LOGOUT");
        ToolsMethods.ProductCheck("//*[@id=\"reset_sidebar_link\"]","RESET_APP_STATE");
    }

    @Step("Нажата кнопка 'LOGOUT': проверка страницы авторизации")
    public void LogoutCheck() {
        WebElement button_LOGOUT1 = GetElement("//*[@id=\"logout_sidebar_link\"]");
        button_LOGOUT1.click();
        DisplayedLogin();
    }

    @Step("Нажата кнопка ADD TO CART на любом товаре")
    public void ClickADD() {
        WebElement button = GetElement("//*[starts-with(text(), 'Add to cart')]");
        button.click();
        BasketSchet("1");
        WebElement buttonR = GetElement( "//*[starts-with(text(), 'Remove')]");
        ToolsMethods.displayed_text(buttonR,"REMOVE");
    }

    @Step("Нажата кнопка с иконкой корзины: элементы отобразились")
    public void ClickBasket() {
        WebElement button_set = GetElement("//*[@id=\"shopping_cart_container\"]/a");
        button_set.click();
        ToolsMethods.ProductCheck("//*[@id=\"header_container\"]/div[2]/span", "Your_Cart");
        ToolsMethods.ProductCheck("//*[@id=\"cart_contents_container\"]/div/div[1]/div[1]", "qty");
        ToolsMethods.ProductCheck("//*[@id=\"cart_contents_container\"]/div/div[1]/div[2]", "DESCRIPTION");
        ToolsMethods.ProductCheck("//*[@id=\"item_4_title_link\"]/div","Sauce Labs Backpack");
        ToolsMethods.ProductCheck("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[1]", "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        ToolsMethods.ProductCheck("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div","$29.99");
    }
    @Step("Нажата кнопка с иконкой корзины")
    public void ClickRemove() {
        WebElement buttonR = GetElement( "//*[@id=\"remove-sauce-labs-backpack\"]");
        buttonR.click();
    }

    public void ClickLogout() throws InterruptedException {
        WebElement button_menu1 = GetElement("//*[@id=\"menu_button_container\"]/div/div[1]/div");
        button_menu1.click();
        Thread.sleep(1000L);
        LogoutCheck();
    }

    public static WebElement GetElement(String XPath) {
        WebElement Element = driver.findElement(By.xpath(XPath));
        return Element;
    }



}