package com.example.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorizationPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement login;


    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordWebElement;

    @FindBy(xpath = "/html/body/esia-root/div/esia-login/div/div[1]/form/div[4]/button")
    private WebElement buttonWebElement;

    @FindBy(xpath = "/html/body/esia-root/div/esia-login/div/div[1]/form/div[4]/div/div[2]/div[1]/button")
    private WebElement qrCodeWebElement;

    public AuthorizationPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void setNameUser(String name) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(login));
        login.sendKeys(name);
    }

    public void setPassword(String password) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(passwordWebElement));
        passwordWebElement.sendKeys(password);
    }

    public void setButtonWebElement() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonWebElement));
        buttonWebElement.click();
    }


    public void setQrCodeWebElementWebElement() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(qrCodeWebElement));
        qrCodeWebElement.click();
    }
}
