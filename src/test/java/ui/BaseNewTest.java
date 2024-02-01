package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseNewTest {
    WebDriver driver;

    @AfterEach
    public void finish() {
        driver.quit();
    }

}
