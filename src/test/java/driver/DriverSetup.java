package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    public WebDriver driver;

    public void WebDriverSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
