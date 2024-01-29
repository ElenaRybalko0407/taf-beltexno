package by.itacademy.rybalko.ui;

import by.itacademy.rybalko.singlton.Singlton;
import org.openqa.selenium.*;

import java.util.List;

public class AcerProgect { //beltexno
    public String inputButtonEnter = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[1]/a[1]";
    public String textNumberMail = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/div/div[2]/input";
    public String textPassword = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/div/div[3]/input";
    public String clickSubmit = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/div/button";
    public String textErrorMail = "//*[@id=\"account-login\"]/div[2]/div[1]/div/div/form/div[2]/div/div[2]/span[2]";
    public String textErrorPassword = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/h4";
    public String textErrorPasswordTwo = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/div/div[3]/span[2]";
    public String textErrorMailTwo = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/div/ul/li/div/div[2]/div[1]/div/div/form/div[2]/div/div[2]/span[2]";

    //локатор на строку поиска
    private String search = "/html/body/div[1]/div[1]/header/div[1]/div/div/div[2]/div/div/div/input";

    //локатор на коллекцию web-элементов
    private String searchProdact = "/html/body/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/aside/ul/li[1]/a";
    public String clickButtonCatalog = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[1]/div/ul/li[1]";
    public String clickButtonCatalogNout = "/html/body/div[1]/div[1]/header/div[2]/div/div/div[1]/div/ul/li[1]/div/div[1]/ul/li[1]/a";
    //  public String clicButtonCatalogAcer = "/html/body/div[1]/div[2]/div/div/div/div/aside/div[2]/ul/li[1]/ul/li[2]/a";
    public String clicButtonNout1 = "/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/ul/div/div/li[1]/div/div/div[1]/div[1]/div/div/div/a/img";
    public String clicButtonAddInBusketNout = "//*[@style='display:inline-table;' or @class='add_to_cart' or data-size='57296']";
    //"//*[@style='display:inline-table;' or @class='add_to_cart' or data-size='57296']"
    //a[@class="add_to_cart"]
    //class="add_to_cart"add_to_cart
    //*[@id="center_column"]/div[1]/div/div[2]/div[2]/div[3]/div[2]/a[2]/i
    // /html/body/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div[2]/div[3]/div[2]/a[2]/i
    //*[@id="center_column"]/div[1]/div/div[2]/div[2]/div[3]/div[2]/a[2]
    // /html/body/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div[2]/div[3]/div[2]/a[2]
    //*[@id="center_column"]/div[1]/div/div[2]/div[2]/div[3]/div[2]/a[2]
    public String clicButtonNout2 = "/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/ul/div/div/li[2]/div/div/div[2]/div/div[1]/a";
    public String clicButtonAddInBusket2 = "/html/body/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div[2]/div[3]/div[2]/a[2]";
    public String clickOformlenie = "/html/body/div[3]/div/div/div[2]/div/ul/li/div/div/div/div[2]/div/a";
    public String textInBusket = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[1]/header/h1";
    private String seatch = "//input[@id='search_query_top']";
    // "/html/body/div[1]/div[1]/header/div[1]/div/div/div[2]/div/div/div/input";
    private String productCard = "//li[@class='view_list_item_grid ajax_block_product col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']";


    WebDriver driver;

    public AcerProgect() {
        this.driver = Singlton.getDriver();
    }

      /* public AcerProgect(WebDriver driver) {
        this.driver = driver;
    }*/

    public void inputButtonEnter() {
        driver.findElement(By.xpath(inputButtonEnter)).click();
    }

    public void tabLinkNumberMail() {
        driver.findElement(By.xpath(textNumberMail)).click();
    }

    public void sendKeysTextNumberMail(String mail) {
        driver.findElement(By.xpath(textNumberMail)).sendKeys(mail);
    }

    public void tabLinkTextPassword() {
        driver.findElement(By.xpath(textPassword)).click();
    }

    public void sendKeysTextPassword(String password) {
        driver.findElement(By.xpath(textPassword)).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(By.xpath(clickSubmit)).click();
    }

    public String textErrorMail() {
        return driver.findElement(By.xpath(textErrorMail)).getText();
    }

    public String textErrorPassword() {
        return driver.findElement(By.xpath(textErrorPassword)).getText();
    }

    public String textErrorPasswordTwo() {
        return driver.findElement(By.xpath(textErrorPasswordTwo)).getText();
    }

    public String textErrorMailTwo() {
        return driver.findElement(By.xpath(textErrorMailTwo)).getText();
    }

    public void clickButtonCatalog() {
        driver.findElement(By.xpath(clickButtonCatalog)).click();
    }

    public void clickButtonCatalogNout() {
        driver.findElement(By.xpath(clickButtonCatalogNout)).click();
    }

    // public void clicButtonCatalogAcer(){
    //    driver.findElement(By.xpath(clicButtonCatalogAcer)).click();
    //  }
    public void clicButtonNout1() {
        driver.findElement(By.xpath(clicButtonNout1)).click();
    }

    public void clicButtonAddInBusketNout() {
        driver.findElement(By.xpath(clicButtonAddInBusketNout)).click();
    }

    public void clicButtonNout2() {
        driver.findElement(By.xpath(clicButtonNout2)).click();
    }

    public void clicButtonAddInBusket2() {
        driver.findElement(By.xpath(clicButtonAddInBusket2)).click();
    }

    public void clickOformlenie() {
        driver.findElement(By.xpath(clickOformlenie)).click();
    }

    public String textInBusket() {
        return driver.findElement(By.xpath(textInBusket)).getText();
    }

    public void sendKeasSearch(String textSearch) {
        driver.findElement(By.xpath(search)).sendKeys(textSearch + Keys.ENTER);
    }

    //возвращение списка вэб-элементов
    public List<WebElement> getProductCards() {
        //возвращает то, что выполнит драйвер с помощью метода findElements (список)
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

   /* public void clickJS(WebElement elementBy) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementBy);
    }*/

}
