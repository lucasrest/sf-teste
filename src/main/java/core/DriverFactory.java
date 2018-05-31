package core;

import core.enumerador.BrowserDriverEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private final BrowserDriverEnum browserDriverEnum;

    private WebDriver driver = null;

    public DriverFactory(BrowserDriverEnum browserDriverEnum) {
        this.browserDriverEnum = browserDriverEnum;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            switch (browserDriverEnum) {
                case CHROME: return new ChromeDriver();
                case FIREFOX: return new FirefoxDriver();
            }
        }
        return driver;
    }

    public void killDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
