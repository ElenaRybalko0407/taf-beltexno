package ui;

import by.itacademy.rybalko.ui.AcerProgect;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import ui.BaseNewTest;

import java.util.List;

public class AcerProgectTest extends BaseNewTest {
    @Test
    public void testSearchAcer() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.inputButtonEnter();
        Thread.sleep(1000);
        acerProgect.tabLinkNumberMail();
        Thread.sleep(1000);
        acerProgect.sendKeysTextNumberMail("mail");
        Thread.sleep(1000);
        acerProgect.tabLinkTextPassword();
        Thread.sleep(1000);
        acerProgect.sendKeysTextPassword("123456");
        Thread.sleep(1000);
        acerProgect.clickSubmit();
        acerProgect.textErrorMail();
        acerProgect.textErrorPassword();
        Thread.sleep(2000);
        String actualMail = acerProgect.textErrorMail();
        Thread.sleep(2000);
        String expectedMail = "Поле \"email\" должно содержать Email адрес";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedMail, actualMail);
        Thread.sleep(2000);
        String actualPassword = acerProgect.textErrorPassword();
        String expectedPassword = "Логин или пароль указан неверно";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testSearchAcerWithoutPassword() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.inputButtonEnter();
        Thread.sleep(1000);
        acerProgect.tabLinkNumberMail();
        Thread.sleep(1000);
        acerProgect.sendKeysTextNumberMail("mail");
        Thread.sleep(1000);
        acerProgect.clickSubmit();
        acerProgect.textErrorMail();
        acerProgect.textErrorPasswordTwo();
        acerProgect.textErrorPassword();
        String actualMail = acerProgect.textErrorMail();
        Thread.sleep(2000);
        String expectedMail = "Поле \"email\" должно содержать Email адрес";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedMail, actualMail);
        Thread.sleep(2000);
        String actualPasswordTwo = acerProgect.textErrorPasswordTwo();
        String expectedPasswordTwo = "Поле \"password\" не может быть пустым";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedPasswordTwo, actualPasswordTwo);
        Thread.sleep(2000);
        String actualPassword = acerProgect.textErrorPassword();
        String expectedPassword = "Логин или пароль указан неверно";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testSearchAcerWithoutMail() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.inputButtonEnter();
        Thread.sleep(1000);
        acerProgect.tabLinkTextPassword();
        Thread.sleep(1000);
        acerProgect.sendKeysTextPassword("123456");
        Thread.sleep(1000);
        acerProgect.clickSubmit();
        acerProgect.textErrorMailTwo();
        acerProgect.textErrorPassword();
        Thread.sleep(2000);
        String actualErrorMailTwo = acerProgect.textErrorMailTwo();
        Thread.sleep(2000);
        String expectedErrorMailTwo = "Поле \"email\" не может быть пустым";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedErrorMailTwo, actualErrorMailTwo);
        Thread.sleep(2000);
        String actualPassword = acerProgect.textErrorPassword();
        String expectedPassword = "Логин или пароль указан неверно";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testSearchAcerWithoutMailAndPassword() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.inputButtonEnter();
        Thread.sleep(1000);
        acerProgect.clickSubmit();
        acerProgect.textErrorMailTwo();
        acerProgect.textErrorPasswordTwo();
        Thread.sleep(2000);
        String actualErrorMailTwo = acerProgect.textErrorMailTwo();
        Thread.sleep(2000);
        String expectedErrorMailTwo = "Поле \"email\" не может быть пустым";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedErrorMailTwo, actualErrorMailTwo);
        Thread.sleep(2000);
        String actualPasswordTwo = acerProgect.textErrorPasswordTwo();
        String expectedPasswordTwo = "Поле \"password\" не может быть пустым";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedPasswordTwo, actualPasswordTwo);
        Thread.sleep(2000);
        String actualPassword = acerProgect.textErrorPassword();
        String expectedPassword = "Логин или пароль указан неверно";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testSearchAcerFullButton() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        Thread.sleep(1000);
        acerProgect.clickButtonCatalog();
        Thread.sleep(1000);
        acerProgect.clickButtonCatalogNout();
        Thread.sleep(3000);
        acerProgect.clicButtonNout1();
        Thread.sleep(5000);
        acerProgect.clicButtonAddInBusketNout();
        Thread.sleep(3000);
        acerProgect.clicButtonNout2();
        Thread.sleep(3000);
        acerProgect.clicButtonAddInBusket2();
        Thread.sleep(3000);
        acerProgect.clickOformlenie();
        Thread.sleep(1000);
        String actualAnswer = acerProgect.textInBusket();
        Thread.sleep(1000);
        String expectedAnswer = "Корзина товаров";
        Thread.sleep(2000);
        Assertions.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void testSearchNout() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.openHomePage();
        Thread.sleep(3000);
        //извлекаем коллекцию веб-элементов
        acerProgect.sendKeasSearch("Ноутбук Acer TravelMate");
        List<WebElement> productCards = acerProgect.getProductCards();
        System.out.println(productCards);
    }

    @Test
    public void testSearchAllNout() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.openHomePage();
        Thread.sleep(3000);
        //извлекаем коллекцию веб-элементов
        acerProgect.sendKeasSearch("Ноутбук Acer TravelMate");
        List<WebElement> productCards = acerProgect.getProductCards();
        acerProgect.printTextProdactCard();
    }

}
