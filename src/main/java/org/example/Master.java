package org.example;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static java.sql.DriverManager.getDriver;
import static java.sql.DriverManager.println;

class Master {
    @Test
    @Description("[Тест-5321] Проверка работы страницы с продуктами пользователем standard_user")
    public void test0() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000L);

        WebElement user1 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name1= "Username";
        visibale_name(user1, name1);
        WebElement pass1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name1= "Password";
        visibale_name(pass1,name1);
        WebElement log1 = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name1= "LOGIN";
        visibale_name(log1, name1);


        WebElement UserName = driver.findElement(By.xpath("//*[@id='user-name']"));
        UserName.click();
        UserName.sendKeys("standard_user");
        Thread.sleep(1000L);

        WebElement password = driver.findElement(By.xpath("//*[@id=\'password\']"));
        password.click();
        password.sendKeys("secret_sauce");

        Thread.sleep(1000L);

        WebElement login_button = driver.findElement(By.xpath("//*[@id=\'login-button\']"));
        login_button.click();
        Thread.sleep(2000L);


        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {

            Allure.addAttachment("Ошибка авторизации", "Epic sadface: Sorry, this user has been locked out.");

        }


        Thread.sleep(1000L);
        WebElement inventory_item_name1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        visibale_text(inventory_item_name1, "Sauce Labs Backpack");

        WebElement inventory_item_name2 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bike Light')]"));
        visibale_text(inventory_item_name2, "Sauce Labs Bike Light");

        WebElement inventory_item_name3 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bolt T-Shirt')]"));
        visibale_text(inventory_item_name3, "Sauce Labs Bolt T-Shirt");

        WebElement inventory_item_name4 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Fleece Jacket')]"));
        visibale_text(inventory_item_name4, "Sauce Labs Fleece Jacket");

        WebElement inventory_item_name5 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Onesie')]"));
        visibale_text(inventory_item_name5, "Sauce Labs Onesie");

        WebElement inventory_item_name6 = driver.findElement(By.xpath("//*[starts-with(text(), 'Test.allTheThings() T-Shirt (Red)')]"));
        visibale_text(inventory_item_name6, "Test.allTheThings() T-Shirt (Red)");

        WebElement button = driver.findElement(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        List<WebElement> buttonS = button.findElements(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        System.out.println(buttonS.size());
        Thread.sleep(1000L);


        WebElement inventory_text = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div"));
        visibale_text(inventory_text, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");

        WebElement inventory_text1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div"));
        visibale_text(inventory_text1, "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");

        WebElement inventory_text2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div"));
        visibale_text(inventory_text2, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");

        WebElement inventory_text3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div"));
        visibale_text(inventory_text3, "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");

        WebElement inventory_text4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div"));
        visibale_text(inventory_text4, "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");

        WebElement inventory_text5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div"));
        visibale_text(inventory_text5, "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");


        WebElement inventory_sum = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
        visibale_text(inventory_sum, "$29.99");

        WebElement inventory_sum1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div"));
        visibale_text(inventory_sum1, "$9.99");

        WebElement inventory_sum2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div"));
        visibale_text(inventory_sum2, "$15.99");

        WebElement inventory_sum3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div"));
        visibale_text(inventory_sum3, "$49.99");

        WebElement inventory_sum4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div"));
        visibale_text(inventory_sum4, "$7.99");

        WebElement inventory_sum5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div"));
        visibale_text(inventory_sum5, "$15.99");

        for (int i = 0; i < buttonS.size(); i++) {
            buttonS.get(i).click();
            String strI = "" + i;
            if (isClickable(buttonS.get(i), driver) == true) {


                Allure.addAttachment("данная кнопка не активна", strI);

            }
            else {
                Allure.addAttachment("данная кнопка акнивна", strI);
            }
            Thread.sleep(1000L);
        }
        Thread.sleep(1000L);
        WebElement number = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        Allure.addAttachment("У корзины отобразился счетчик с", number.getText());

        WebElement button1 = driver.findElement(By.xpath("//*[starts-with(text(), 'Remove')]"));
        List<WebElement> buttonS1 = button1.findElements(By.xpath("//*[starts-with(text(), 'Remove')]"));
        System.out.println(buttonS1.size());

        for (int i = 0; i < buttonS1.size(); i++) {
            buttonS1.get(i).click();
            Thread.sleep(1000L);
        }


        WebElement number_r = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
        Allure.addAttachment("У корзины отобразился счетчик с", number_r.getText());

        Thread.sleep(2000L);



        WebElement button_sort1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        button_sort1.click();
        Thread.sleep(1000L);

        WebElement button_Z_A1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
        button_Z_A1.click();
        Thread.sleep(1000L);

        WebElement button_menu1 = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div"));
        button_menu1.click();
        Thread.sleep(1000L);

        WebElement ALL_ITEMS = driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]"));
        visibale(ALL_ITEMS);

        WebElement ABOUT = driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]"));
        visibale(ABOUT);

        WebElement LOGOUT = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        visibale(LOGOUT);

        WebElement RESET_APP_STATE = driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]"));
        visibale(RESET_APP_STATE);

        WebElement button_LOGOUT1 = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        button_LOGOUT1.click();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name= "Username";
        visibale_name(user, name);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name= "Password";
        visibale_name(pass,name);
        WebElement log = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name= "LOGIN";
        visibale_name(log, name);



    }
    @Test
    @Description("[Тест-5322] Проверка работы страницы с продуктами пользователем locked_out_user")
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000L);

        WebElement user1 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name1= "Username";
        visibale_name(user1, name1);
        WebElement pass1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name1= "Password";
        visibale_name(pass1,name1);
        WebElement log1 = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name1= "LOGIN";
        visibale_name(log1, name1);


        WebElement UserName = driver.findElement(By.xpath("//*[@id='user-name']"));
        UserName.click();
        UserName.sendKeys("locked_out_user");
        Thread.sleep(1000L);

        WebElement password = driver.findElement(By.xpath("//*[@id=\'password\']"));
        password.click();
        password.sendKeys("secret_sauce");

        Thread.sleep(1000L);

        WebElement login_button = driver.findElement(By.xpath("//*[@id=\'login-button\']"));
        login_button.click();
        Thread.sleep(2000L);


        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {

            Allure.addAttachment("Ошибка авторизации", "Epic sadface: Sorry, this user has been locked out.");

        }


        Thread.sleep(1000L);
        WebElement inventory_item_name1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        visibale_text(inventory_item_name1, "Sauce Labs Backpack");
        WebElement inventory_item_name2 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bike Light')]"));
        visibale_text(inventory_item_name2, "Sauce Labs Bike Light");
        WebElement inventory_item_name3 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bolt T-Shirt')]"));
        visibale_text(inventory_item_name3, "Sauce Labs Bolt T-Shirt");
        WebElement inventory_item_name4 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Fleece Jacket')]"));
        visibale_text(inventory_item_name4, "Sauce Labs Fleece Jacket");
        WebElement inventory_item_name5 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Onesie')]"));
        visibale_text(inventory_item_name5, "Sauce Labs Onesie");
        WebElement inventory_item_name6 = driver.findElement(By.xpath("//*[starts-with(text(), 'Test.allTheThings() T-Shirt (Red)')]"));
        visibale_text(inventory_item_name6, "Test.allTheThings() T-Shirt (Red)");
        WebElement button = driver.findElement(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        List<WebElement> buttonS = button.findElements(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        System.out.println(buttonS.size());
        Thread.sleep(1000L);

        WebElement inventory_text = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div"));
        visibale_text(inventory_text, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");

        WebElement inventory_text1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div"));
        visibale_text(inventory_text1, "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");

        WebElement inventory_text2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div"));
        visibale_text(inventory_text2, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");

        WebElement inventory_text3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div"));
        visibale_text(inventory_text3, "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");

        WebElement inventory_text4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div"));
        visibale_text(inventory_text4, "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");

        WebElement inventory_text5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div"));
        visibale_text(inventory_text5, "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");


        WebElement inventory_sum = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
        visibale_text(inventory_sum, "$29.99");

        WebElement inventory_sum1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div"));
        visibale_text(inventory_sum1, "$9.99");

        WebElement inventory_sum2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div"));
        visibale_text(inventory_sum2, "$15.99");

        WebElement inventory_sum3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div"));
        visibale_text(inventory_sum3, "$49.99");

        WebElement inventory_sum4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div"));
        visibale_text(inventory_sum4, "$7.99");

        WebElement inventory_sum5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div"));
        visibale_text(inventory_sum5, "$15.99");

        for (int i = 0; i < buttonS.size(); i++) {
            buttonS.get(i).click();
            String strI = "" + i;
            if (isClickable(buttonS.get(i), driver) == true) {


                Allure.addAttachment("данная кнопка не активна", strI);

            }
            else {
                Allure.addAttachment("данная кнопка акнивна", strI);
            }
            Thread.sleep(1000L);
        }
        Thread.sleep(1000L);
        WebElement number = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        Allure.addAttachment("У корзины отобразился счетчик с", number.getText());

        WebElement button1 = driver.findElement(By.xpath("//*[starts-with(text(), 'Remove')]"));
        List<WebElement> buttonS1 = button1.findElements(By.xpath("//*[starts-with(text(), 'Remove')]"));
        System.out.println(buttonS1.size());

        for (int i = 0; i < buttonS1.size(); i++) {
            buttonS1.get(i).click();
            Thread.sleep(1000L);
        }


        WebElement number_r = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
        Allure.addAttachment("У корзины отобразился счетчик с", number_r.getText());

        Thread.sleep(2000L);



        WebElement button_sort1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        button_sort1.click();
        Thread.sleep(1000L);

        WebElement button_Z_A1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
        button_Z_A1.click();
        Thread.sleep(1000L);

        WebElement button_menu1 = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div"));
        button_menu1.click();
        Thread.sleep(1000L);

        WebElement ALL_ITEMS = driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]"));
        visibale(ALL_ITEMS);

        WebElement ABOUT = driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]"));
        visibale(ABOUT);

        WebElement LOGOUT = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        visibale(LOGOUT);

        WebElement RESET_APP_STATE = driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]"));
        visibale(RESET_APP_STATE);

        WebElement button_LOGOUT1 = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        button_LOGOUT1.click();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name= "Username";
        visibale_name(user, name);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name= "Password";
        visibale_name(pass,name);
        WebElement log = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name= "LOGIN";
        visibale_name(log, name);



    }
    @Test
    @Description("[Тест-5323] Проверка работы страницы с продуктами пользователем problem_user")
    public void test2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000L);

        WebElement user1 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name1= "Username";
        visibale_name(user1, name1);
        WebElement pass1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name1= "Password";
        visibale_name(pass1,name1);
        WebElement log1 = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name1= "LOGIN";
        visibale_name(log1, name1);


        WebElement UserName = driver.findElement(By.xpath("//*[@id='user-name']"));
        UserName.click();
        UserName.sendKeys("problem_user");
        Thread.sleep(1000L);

        WebElement password = driver.findElement(By.xpath("//*[@id=\'password\']"));
        password.click();
        password.sendKeys("secret_sauce");

        Thread.sleep(1000L);

        WebElement login_button = driver.findElement(By.xpath("//*[@id=\'login-button\']"));
        login_button.click();
        Thread.sleep(2000L);


        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {

            Allure.addAttachment("Ошибка авторизации", "Epic sadface: Sorry, this user has been locked out.");

        }


        Thread.sleep(1000L);
        WebElement inventory_item_name1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        visibale_text(inventory_item_name1, "Sauce Labs Backpack");
        WebElement inventory_item_name2 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bike Light')]"));
        visibale_text(inventory_item_name2, "Sauce Labs Bike Light");
        WebElement inventory_item_name3 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bolt T-Shirt')]"));
        visibale_text(inventory_item_name3, "Sauce Labs Bolt T-Shirt");
        WebElement inventory_item_name4 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Fleece Jacket')]"));
        visibale_text(inventory_item_name4, "Sauce Labs Fleece Jacket");
        WebElement inventory_item_name5 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Onesie')]"));
        visibale_text(inventory_item_name5, "Sauce Labs Onesie");
        WebElement inventory_item_name6 = driver.findElement(By.xpath("//*[starts-with(text(), 'Test.allTheThings() T-Shirt (Red)')]"));
        visibale_text(inventory_item_name6, "Test.allTheThings() T-Shirt (Red)");
        WebElement button = driver.findElement(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        List<WebElement> buttonS = button.findElements(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        System.out.println(buttonS.size());
        Thread.sleep(1000L);
        WebElement inventory_text = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div"));
        visibale_text(inventory_text, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");

        WebElement inventory_text1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div"));
        visibale_text(inventory_text1, "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");

        WebElement inventory_text2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div"));
        visibale_text(inventory_text2, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");

        WebElement inventory_text3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div"));
        visibale_text(inventory_text3, "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");

        WebElement inventory_text4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div"));
        visibale_text(inventory_text4, "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");

        WebElement inventory_text5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div"));
        visibale_text(inventory_text5, "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");


        WebElement inventory_sum = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
        visibale_text(inventory_sum, "$29.99");

        WebElement inventory_sum1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div"));
        visibale_text(inventory_sum1, "$9.99");

        WebElement inventory_sum2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div"));
        visibale_text(inventory_sum2, "$15.99");

        WebElement inventory_sum3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div"));
        visibale_text(inventory_sum3, "$49.99");

        WebElement inventory_sum4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div"));
        visibale_text(inventory_sum4, "$7.99");

        WebElement inventory_sum5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div"));
        visibale_text(inventory_sum5, "$15.99");

        for (int i = 0; i < buttonS.size(); i++) {
            buttonS.get(i).click();
            String strI = "" + i;
            if (isClickable(buttonS.get(i), driver) == true) {


                Allure.addAttachment("данная кнопка не активна", strI);

            }
            else {
                Allure.addAttachment("данная кнопка акнивна", strI);
            }
            Thread.sleep(1000L);
        }
        Thread.sleep(1000L);
        WebElement number = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        Allure.addAttachment("У корзины отобразился счетчик с", number.getText());

        WebElement button1 = driver.findElement(By.xpath("//*[starts-with(text(), 'Remove')]"));
        List<WebElement> buttonS1 = button1.findElements(By.xpath("//*[starts-with(text(), 'Remove')]"));
        System.out.println(buttonS1.size());

        for (int i = 0; i < buttonS1.size(); i++) {
            buttonS1.get(i).click();
            Thread.sleep(1000L);
        }


        WebElement number_r = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
        Allure.addAttachment("У корзины отобразился счетчик с", number_r.getText());

        Thread.sleep(2000L);



        WebElement button_sort1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        button_sort1.click();
        Thread.sleep(1000L);

        WebElement button_Z_A1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
        button_Z_A1.click();
        Thread.sleep(1000L);

        WebElement button_menu1 = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div"));
        button_menu1.click();
        Thread.sleep(1000L);

        WebElement ALL_ITEMS = driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]"));
        visibale(ALL_ITEMS);

        WebElement ABOUT = driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]"));
        visibale(ABOUT);

        WebElement LOGOUT = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        visibale(LOGOUT);

        WebElement RESET_APP_STATE = driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]"));
        visibale(RESET_APP_STATE);

        WebElement button_LOGOUT1 = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        button_LOGOUT1.click();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name= "Username";
        visibale_name(user, name);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name= "Password";
        visibale_name(pass,name);
        WebElement log = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name= "LOGIN";
        visibale_name(log, name);



    }
    @Test
    @Description("[Тест-5324] Проверка работы страницы с продуктами пользователем performance_glitch_user")
    public void test3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000L);

        WebElement user1 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name1= "Username";
        visibale_name(user1, name1);
        WebElement pass1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name1= "Password";
        visibale_name(pass1,name1);
        WebElement log1 = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name1= "LOGIN";
        visibale_name(log1, name1);


        WebElement UserName = driver.findElement(By.xpath("//*[@id='user-name']"));
        UserName.click();
        UserName.sendKeys("performance_glitch_user");
        Thread.sleep(1000L);

        WebElement password = driver.findElement(By.xpath("//*[@id=\'password\']"));
        password.click();
        password.sendKeys("secret_sauce");

        Thread.sleep(1000L);

        WebElement login_button = driver.findElement(By.xpath("//*[@id=\'login-button\']"));
        login_button.click();
        Thread.sleep(2000L);


        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {

            Allure.addAttachment("Ошибка авторизации", "Epic sadface: Sorry, this user has been locked out.");

        }


        Thread.sleep(1000L);
        WebElement inventory_item_name1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        visibale_text(inventory_item_name1, "Sauce Labs Backpack");
        WebElement inventory_item_name2 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bike Light')]"));
        visibale_text(inventory_item_name2, "Sauce Labs Bike Light");
        WebElement inventory_item_name3 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bolt T-Shirt')]"));
        visibale_text(inventory_item_name3, "Sauce Labs Bolt T-Shirt");
        WebElement inventory_item_name4 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Fleece Jacket')]"));
        visibale_text(inventory_item_name4, "Sauce Labs Fleece Jacket");
        WebElement inventory_item_name5 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Onesie')]"));
        visibale_text(inventory_item_name5, "Sauce Labs Onesie");
        WebElement inventory_item_name6 = driver.findElement(By.xpath("//*[starts-with(text(), 'Test.allTheThings() T-Shirt (Red)')]"));
        visibale_text(inventory_item_name6, "Test.allTheThings() T-Shirt (Red)");
        WebElement button = driver.findElement(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        List<WebElement> buttonS = button.findElements(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        System.out.println(buttonS.size());
        Thread.sleep(1000L);
        WebElement inventory_text = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div"));
        visibale_text(inventory_text, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");

        WebElement inventory_text1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div"));
        visibale_text(inventory_text1, "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");

        WebElement inventory_text2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div"));
        visibale_text(inventory_text2, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");

        WebElement inventory_text3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div"));
        visibale_text(inventory_text3, "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");

        WebElement inventory_text4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div"));
        visibale_text(inventory_text4, "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");

        WebElement inventory_text5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div"));
        visibale_text(inventory_text5, "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");


        WebElement inventory_sum = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
        visibale_text(inventory_sum, "$29.99");

        WebElement inventory_sum1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div"));
        visibale_text(inventory_sum1, "$9.99");

        WebElement inventory_sum2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div"));
        visibale_text(inventory_sum2, "$15.99");

        WebElement inventory_sum3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div"));
        visibale_text(inventory_sum3, "$49.99");

        WebElement inventory_sum4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div"));
        visibale_text(inventory_sum4, "$7.99");

        WebElement inventory_sum5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div"));
        visibale_text(inventory_sum5, "$15.99");

        for (int i = 0; i < buttonS.size(); i++) {
            buttonS.get(i).click();
            String strI = "" + i;
            if (isClickable(buttonS.get(i), driver) == true) {


                Allure.addAttachment("данная кнопка не активна", strI);

            }
            else {
                Allure.addAttachment("данная кнопка акнивна", strI);
            }
            Thread.sleep(1000L);
        }
        Thread.sleep(1000L);
        WebElement number = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        Allure.addAttachment("У корзины отобразился счетчик с", number.getText());

        WebElement button1 = driver.findElement(By.xpath("//*[starts-with(text(), 'Remove')]"));
        List<WebElement> buttonS1 = button1.findElements(By.xpath("//*[starts-with(text(), 'Remove')]"));
        System.out.println(buttonS1.size());

        for (int i = 0; i < buttonS1.size(); i++) {
            buttonS1.get(i).click();
            Thread.sleep(1000L);
        }


        WebElement number_r = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
        Allure.addAttachment("У корзины отобразился счетчик с", number_r.getText());

        Thread.sleep(2000L);



        WebElement button_sort1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        button_sort1.click();
        Thread.sleep(1000L);

        WebElement button_Z_A1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
        button_Z_A1.click();
        Thread.sleep(1000L);

        WebElement button_menu1 = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div"));
        button_menu1.click();
        Thread.sleep(1000L);

        WebElement ALL_ITEMS = driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]"));
        visibale(ALL_ITEMS);

        WebElement ABOUT = driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]"));
        visibale(ABOUT);

        WebElement LOGOUT = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        visibale(LOGOUT);

        WebElement RESET_APP_STATE = driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]"));
        visibale(RESET_APP_STATE);

        WebElement button_LOGOUT1 = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        button_LOGOUT1.click();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name= "Username";
        visibale_name(user, name);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name= "Password";
        visibale_name(pass,name);
        WebElement log = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name= "LOGIN";
        visibale_name(log, name);



    }

    @Test
    @Description("Проверка удаления товара из списка на странице с корзиной")

    public void test5() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000L);

        WebElement user1 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name1= "Username";
        visibale_name(user1, name1);
        WebElement pass1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name1= "Password";
        visibale_name(pass1,name1);
        WebElement log1 = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name1= "LOGIN";
        visibale_name(log1, name1);


        WebElement UserName = driver.findElement(By.xpath("//*[@id='user-name']"));
        UserName.click();
        UserName.sendKeys("standard_user");
        Thread.sleep(1000L);

        WebElement password = driver.findElement(By.xpath("//*[@id=\'password\']"));
        password.click();
        password.sendKeys("secret_sauce");


        Thread.sleep(1000L);

        WebElement login_button = driver.findElement(By.xpath("//*[@id=\'login-button\']"));
        login_button.click();
        Thread.sleep(2000L);


        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {

            Allure.addAttachment("Ошибка авторизации", "Epic sadface: Sorry, this user has been locked out.");

        }


        Thread.sleep(1000L);
        WebElement inventory_item_name1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        visibale_text(inventory_item_name1, "Sauce Labs Backpack");
        WebElement inventory_item_name2 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bike Light')]"));
        visibale_text(inventory_item_name2, "Sauce Labs Bike Light");
        WebElement inventory_item_name3 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Bolt T-Shirt')]"));
        visibale_text(inventory_item_name3, "Sauce Labs Bolt T-Shirt");
        WebElement inventory_item_name4 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Fleece Jacket')]"));
        visibale_text(inventory_item_name4, "Sauce Labs Fleece Jacket");
        WebElement inventory_item_name5 = driver.findElement(By.xpath("//*[starts-with(text(), 'Sauce Labs Onesie')]"));
        visibale_text(inventory_item_name5, "Sauce Labs Onesie");
        WebElement inventory_item_name6 = driver.findElement(By.xpath("//*[starts-with(text(), 'Test.allTheThings() T-Shirt (Red)')]"));
        visibale_text(inventory_item_name6, "Test.allTheThings() T-Shirt (Red)");
        WebElement button = driver.findElement(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        List<WebElement> buttonS = button.findElements(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        System.out.println(buttonS.size());
        Thread.sleep(1000L);
        WebElement inventory_text = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div"));
        visibale_text(inventory_text, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");

        WebElement inventory_text1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div"));
        visibale_text(inventory_text1, "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");

        WebElement inventory_text2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div"));
        visibale_text(inventory_text2, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");

        WebElement inventory_text3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div"));
        visibale_text(inventory_text3, "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");

        WebElement inventory_text4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div"));
        visibale_text(inventory_text4, "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");

        WebElement inventory_text5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div"));
        visibale_text(inventory_text5, "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");


        WebElement inventory_sum = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
        visibale_text(inventory_sum, "$29.99");

        WebElement inventory_sum1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div"));
        visibale_text(inventory_sum1, "$9.99");

        WebElement inventory_sum2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div"));
        visibale_text(inventory_sum2, "$15.99");

        WebElement inventory_sum3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div"));
        visibale_text(inventory_sum3, "$49.99");

        WebElement inventory_sum4 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div"));
        visibale_text(inventory_sum4, "$7.99");

        WebElement inventory_sum5 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div"));
        visibale_text(inventory_sum5, "$15.99");

        for (int i = 0; i < buttonS.size(); i++) {
            buttonS.get(i).click();
            String strI = "" + i;
            if (isClickable(buttonS.get(i), driver) == true) {


                Allure.addAttachment("данная кнопка не активна", strI);

            }
            else {
                Allure.addAttachment("данная кнопка акнивна", strI);
            }
            Thread.sleep(1000L);
        }
        Thread.sleep(1000L);

        WebElement button1 = driver.findElement(By.xpath("//*[starts-with(text(), 'Remove')]"));
        List<WebElement> buttonS1 = button1.findElements(By.xpath("//*[starts-with(text(), 'Remove')]"));
        System.out.println(buttonS1.size());

        for (int i = 0; i < buttonS1.size(); i++) {
            buttonS1.get(i).click();
            Thread.sleep(1000L);
        }
        WebElement button11 = driver.findElement(By.xpath("//*[starts-with(text(), 'Add to cart')]"));
        button11.click();

        WebElement remove = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
        Allure.addAttachment("У кнопки ADD TO CART поменялось название на", remove.getText());

        WebElement number = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        Allure.addAttachment("У корзины отобразился счетчик с", number.getText());

        Thread.sleep(2000L);
        WebElement button_set = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        button_set.click();

        WebElement Your_Cart = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        visibale(Your_Cart);

        WebElement qty = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[1]"));
        visibale(qty);

        WebElement DESCRIPTION = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[2]"));
        visibale(DESCRIPTION);



        Thread.sleep(2000L);
        WebElement button12 = driver.findElement(By.xpath("//*[starts-with(text(), 'Remove')]"));
        button12.click();

        Thread.sleep(2000L);
        WebElement button_shop = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
        button_shop.click();

        WebElement button_sort1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        button_sort1.click();
        Thread.sleep(1000L);

        WebElement button_Z_A1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]"));
        button_Z_A1.click();
        Thread.sleep(1000L);

        WebElement button_menu1 = driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div"));
        button_menu1.click();
        Thread.sleep(1000L);

        WebElement button_LOGOUT1 = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
        button_LOGOUT1.click();

        WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        String name= "Username";
        visibale_name(user, name);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        name= "Password";
        visibale_name(pass,name);
        WebElement log = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        name= "LOGIN";
        visibale_name(log, name);



    }


    public static boolean isClickable(WebElement el, WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
            wait.until(ExpectedConditions.elementToBeClickable(el));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static void visibale_text(WebElement el, String text) {
        String text1 = el.getText();
        if (text1.equals(text)) {
            Allure.addAttachment("отображается", el.getText());
        }
        else{
            Allure.addAttachment("не отображается", text1);
        }


    }
    public static void visibale(WebElement el) {
        if (el.isDisplayed()) {
            Allure.addAttachment("отображается", el.getText());
        }
        else{
            Allure.addAttachment("не отображается", el.getText());
            }


    }
    public static void visibale_name(WebElement el, String name) {
        if (el.isDisplayed()) {
            Allure.addAttachment("отображается", name);
        }
        else{
            Allure.addAttachment("не отображается", name);
        }


    }




}