package by.itacademy.rybalko.ui;

import by.itacademy.rybalko.singlton.Singlton;
import org.openqa.selenium.*;

import java.util.List;

public class AcerProgect {
    public String inputButtonEnter = "//a[@class='singin']";                                                                                                                                                                   //  "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[1]/a[1]";
    public String textNumberMail = "//input[@type='email']";                                                                                                                                                                    //"/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/div/div[2]/input";
    public String textPassword = "//input[@type=\"password\"]";                                                                                                                                                              //    "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/div/div[3]/input";
    public String clickSubmit = "//button[@class=\"btn btn-default btn_enter_account\"]";                                                                                                                                      //   "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/div/button";
    public String textErrorMail = "//*[text() = 'Поле \"email\" должно содержать Email адрес']";                                                                                                                                //*[text() = 'Поле "email" должно содержать Email адрес']                                                       //"//*[@id=\"account-login\"]/div[2]/div[1]/div/div/form/div[2]/div/div[2]/span[2]";                                                                                                                          //*[@id="account-login"]//div[1]/div/div/form/div[2]/div/div[2]/span[2]
    public String textErrorPassword = "//*[text() = 'Логин или пароль указан неверно']";
    public String textErrorPasswordTwo = "//*[text() = 'Поле \"password\" не может быть пустым']";                                                                                                                               //"/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/div/div[3]/span[2]";
    public String textErrorMailTwo = "//*[text() = 'Поле \"email\" не может быть пустым']";                                                                                                                                      //"/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/div/div[2]/span[2]";
    private String search = "//input[@type=\"text\"]";                                                                                                                                                                          //"/html/body/div[1]/div[1]/header/div[1]/div/div/div[2]/div/div/div/input";
    public String productCard = "//div[@class='slider']";                                                                                                                                                                                                 //"/html/body/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/aside/ul/li[1]/a";
    public String clickButtonCatalog = "//*[text() = 'Каталог']";                                                                                                                                                                 //"/html/body/div[1]/div[1]/header/div[2]/div/div/div[1]/div/ul/li[1]";
    public String clickButtonCatalogNout = "//*[text() = ' Ноутбуки']";                                                                                                                                                                 //"/html/body/div[1]/div[1]/header/div[2]/div/div/div[1]/div/ul/li[1]/div/div[1]/ul/li[1]/a";
    public String clickButtonNout1 = "//a[@class='product_img_link' and @href='/catalog/igrovoi-noutbuk-asus-rog-strix-g18-2023-g814ju-n5059']";                                                                                    //"/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/ul/div/div/li[1]/div/div/div[1]/div[1]/div/div/div/a/img";                                                                                                                                                                             //"/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/ul/div/div/li[1]/div/div/div[1]/div[1]/div/div/div/a/img";
    public String clickButtonAddInBucketNout = "//*[@style='display:inline-table;' or @class='add_to_cart' or data-size='57296']";
    public String textInBucket = "//*[text() = 'Игровой ноутбук ASUS ROG Strix G18 (2023) G814JU-N5059']";                                                                                                                                 //"/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/header/h1";

    WebDriver driver;

    public AcerProgect() {
        this.driver = Singlton.getDriver();
    }

    public void inputButtonEnter() throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(inputButtonEnter)).click();
    }

    public void tabLinkNumberMail() throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(textNumberMail)).click();
    }

    public void sendKeysTextNumberMail(String mail) throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(textNumberMail)).sendKeys(mail);
    }

    public void tabLinkTextPassword() throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(textPassword)).click();
    }

    public void sendKeysTextPassword(String password) throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(textPassword)).sendKeys(password);
    }

    public void clickSubmit() throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(clickSubmit)).click();
    }

    public String textErrorMail() throws InterruptedException {
        waiter();
        return driver.findElement(By.xpath(textErrorMail)).getText();
    }

    public String textErrorPassword() throws InterruptedException {
        waiter();
        return driver.findElement(By.xpath(textErrorPassword)).getText();
    }

    public String textErrorPasswordTwo() throws InterruptedException {
        waiter();
        return driver.findElement(By.xpath(textErrorPasswordTwo)).getText();
    }

    public String textErrorMailTwo() throws InterruptedException {
        waiter();
        return driver.findElement(By.xpath(textErrorMailTwo)).getText();
    }

    public void clickButtonCatalog() throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(clickButtonCatalog)).click();
    }

    public void clickButtonCatalogNout() throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(clickButtonCatalogNout)).click();
    }

    public void clicButtonNout1() throws InterruptedException {
        waiter();
        driver.findElement(By.xpath(clickButtonNout1)).click();
    }

    public void clicButtonAddInBusketNout() throws InterruptedException {
        waiter();
        WebElement element = driver.findElement(By.xpath(clickButtonAddInBucketNout));
        clickElement(driver, element);
    }

    public void clickElement(WebDriver driver, WebElement element) throws InterruptedException {
        waiter();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public String textInBusket() {
        return driver.findElement(By.xpath(textInBucket)).getText();
    }

    public void sendKeasSearch(String textSearch) {
        driver.findElement(By.xpath(search)).sendKeys(textSearch + Keys.ENTER);
    }

    public List<WebElement> getProductCards() {
        return driver.findElements(By.xpath(productCard));
    }

    public void openHomePage() {
        driver.get("https://beltexno.by/");
    }

    public void printTextProdactCard() {
        List<WebElement> prodactCards = getProductCards();
        for (WebElement prodactCard : prodactCards) {
            System.out.println(prodactCard.getText() + "\n");
        }
    }

    public void waiter() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void openLoginFormAndSendTextMail(String email) throws InterruptedException {
        inputButtonEnter();
        tabLinkNumberMail();
        sendKeysTextNumberMail(email);
    }

    public void sendTextPasswordAndClickSubmit(String password) throws InterruptedException {
        tabLinkTextPassword();                                                                                                       //acerProgect.tabLinkNumberMail();
        sendKeysTextPassword(password);                                                                                             // acerProgect.sendKeysTextNumberMail("mail");
        clickSubmit();
    }

}
