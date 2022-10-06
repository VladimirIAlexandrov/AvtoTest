package test.JavaTest;

import org.example.*;


import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.example.HelperMethods;
import org.testng.annotations.Test;

public class GTest {
    @Test
    @Description("[Тест-5321] Проверка работы страницы с продуктами пользователем standard_user")
    public void test1() throws InterruptedException {
        Master test = new Master();
        Master.test("standard_user", "secret_sauce");
    }
    @Test
    @Description("[Тест-5322] Проверка работы страницы с продуктами пользователем locked_out_user")
    public void test2() throws InterruptedException{
        Master.test1("locked_out_user", "secret_sauce");
    }
    @Test
    @Description("[Тест-5323] Проверка работы страницы с продуктами пользователем problem_user")
    public void test3() throws InterruptedException{
        Master.test("problem_user", "secret_sauce");

    }
    @Test
    @Description("[Тест-5324] Проверка работы страницы с продуктами пользователем performance_glitch_user")
    public void test4() throws InterruptedException{
        Master.test("performance_glitch_user", "secret_sauce");

    }

    @Test
    @Description("[Тест-7578] Проверка удаления товара из списка на странице с корзиной")
    public void test5() throws InterruptedException{
        Master.test1("standard_user", "secret_sauce");

    }
}
