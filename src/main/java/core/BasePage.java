package core;

import core.enumerador.BrowserDriverEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected final WebDriver driver;

    public BasePage() {
        this.driver = new DriverFactory(BrowserDriverEnum.CHROME).getDriver();
    }

    protected void setTexto(By by, String texto) {
        driver.findElement(by).sendKeys(texto);
    }

    protected void setTexto(String id, String texto) {
        setTexto(By.id(id), texto);
    }

    protected void clicar(By by) {
        driver.findElement(by).click();
    }

    protected void clicar(String id) {
        clicar(By.id(id));
    }
}
