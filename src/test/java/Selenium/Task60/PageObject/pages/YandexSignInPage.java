package Selenium.Task60.PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexSignInPage {

    private final WebDriver driver;
    private final By loginField = By.xpath("//input[@id='passp-field-login']");
    private final By passwordField = By.xpath("//input[@id='passp-field-passwd']");
    private final By sigInButton = By.xpath("//button[@id='passp:sign-in']");

    public YandexSignInPage(WebDriver driver) {
        this.driver = driver;

    }

    public YandexInboxPage login(String userName, String userPassword) {
        driver.findElement(loginField).sendKeys(userName);
        driver.findElement(sigInButton).click();
        driver.findElement(passwordField).sendKeys(userPassword);
        driver.findElement(sigInButton).click();
        return new YandexInboxPage(driver);
    }
}
