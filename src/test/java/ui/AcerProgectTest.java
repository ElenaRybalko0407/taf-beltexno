package ui;

import by.itacademy.rybalko.ui.AcerProgect;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;


public class AcerProgectTest extends BaseNewTest {

    @Test
    public void testFieldsLoginAndPassword() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.openLoginFormAndSendTextMail("mail");
        acerProgect.sendTextPasswordAndClickSubmit("123456");
        acerProgect.textErrorMail();
        acerProgect.textErrorPassword();
        String actualMail = acerProgect.textErrorMail();
        String expectedMail = "Поле \"email\" должно содержать Email адрес";
        Assertions.assertEquals(expectedMail, actualMail);
        String actualPassword = acerProgect.textErrorPassword();
        String expectedPassword = "Логин или пароль указан неверно";
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testFieldsWithoutPassword() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.openLoginFormAndSendTextMail("mail");
        acerProgect.clickSubmit();
        acerProgect.textErrorMail();
        acerProgect.textErrorPasswordTwo();
        acerProgect.textErrorPassword();
        String actualMail = acerProgect.textErrorMail();
        String expectedMail = "Поле \"email\" должно содержать Email адрес";
        Assertions.assertEquals(expectedMail, actualMail);
        String actualPasswordTwo = acerProgect.textErrorPasswordTwo();
        String expectedPasswordTwo = "Поле \"password\" не может быть пустым";
        Assertions.assertEquals(expectedPasswordTwo, actualPasswordTwo);
        String actualPassword = acerProgect.textErrorPassword();
        String expectedPassword = "Логин или пароль указан неверно";
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testFieldsWithoutMail() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.inputButtonEnter();
        acerProgect.sendTextPasswordAndClickSubmit("123456");
        acerProgect.textErrorMailTwo();
        acerProgect.textErrorPassword();
        String actualErrorMailTwo = acerProgect.textErrorMailTwo();
        String expectedErrorMailTwo = "Поле \"email\" не может быть пустым";
        Assertions.assertEquals(expectedErrorMailTwo, actualErrorMailTwo);
        String actualPassword = acerProgect.textErrorPassword();
        String expectedPassword = "Логин или пароль указан неверно";
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testFieldsWithoutMailAndPassword() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.inputButtonEnter();
        acerProgect.clickSubmit();
        acerProgect.textErrorMailTwo();
        acerProgect.textErrorPasswordTwo();
        String actualErrorMailTwo = acerProgect.textErrorMailTwo();
        String expectedErrorMailTwo = "Поле \"email\" не может быть пустым";
        Assertions.assertEquals(expectedErrorMailTwo, actualErrorMailTwo);
        String actualPasswordTwo = acerProgect.textErrorPasswordTwo();
        String expectedPasswordTwo = "Поле \"password\" не может быть пустым";
        Assertions.assertEquals(expectedPasswordTwo, actualPasswordTwo);
        String actualPassword = acerProgect.textErrorPassword();
        String expectedPassword = "Логин или пароль указан неверно";
        Assertions.assertEquals(expectedPassword, actualPassword);
    }

    @Test
    public void testButtonWithNout() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.clickButtonCatalog();
        acerProgect.clickButtonCatalogNout();
        acerProgect.clicButtonNout1();
        acerProgect.clicButtonAddInBusketNout();
        String actualAnswer = acerProgect.textInBusket();
        String expectedAnswer = "Игровой ноутбук ASUS ROG Strix G18 (2023) G814JU-N5059";
        Assertions.assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void testSearchNout() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.openHomePage();
        acerProgect.sendKeasSearch("Ноутбук Acer TravelMate");
        List<WebElement> productCards = acerProgect.getProductCards();
        System.out.println(productCards);
    }

    @Test
    public void testSearchAllNout() throws InterruptedException {
        AcerProgect acerProgect = new AcerProgect();
        acerProgect.openHomePage();
        acerProgect.sendKeasSearch("Ноутбук Acer TravelMate");
        List<WebElement> productCards = acerProgect.getProductCards();
        acerProgect.printTextProdactCard();
    }

}



