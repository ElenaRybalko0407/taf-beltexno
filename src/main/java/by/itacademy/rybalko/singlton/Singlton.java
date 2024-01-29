package by.itacademy.rybalko.singlton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singlton {
    private static WebDriver driver;

    //метод getDriver, который возвращает Driver
    public static WebDriver getDriver(){
        if (driver ==null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://beltexno.by/");
        }
        return driver;
    }

    public  static  void quitDriver(){
        if (driver != null){
            driver.quit(); //закрыть
            driver = null; //обнулить
        }
    }

}
