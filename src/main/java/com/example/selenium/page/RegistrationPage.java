package com.example.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
//    /html/body/esia-root/div/esia-login/div/div[2]/button
    @FindBy(xpath = "/html/body/esia-root/div/esia-login/div/div[2]/button")
    private WebElement buttonRegisterWebElement;

    @FindBy(xpath = "/html/body/esia-root/div/esia-registration/div/div/div[1]/button[2]")
    private WebElement anotherWayToRegisterButtonWebElement;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private  WebElement fieldSurnameWebElement;


    private WebDriver driver;

    public RegistrationPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void setButtonRegisterWebElement() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(buttonRegisterWebElement));
        buttonRegisterWebElement.click();
    }

    public void setAnotherWayToRegisterButtonWebElement() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(anotherWayToRegisterButtonWebElement));
        anotherWayToRegisterButtonWebElement.click();
    }

    public void setFieldSurnameWebElement() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(fieldSurnameWebElement));
        fieldSurnameWebElement.sendKeys("Иванов");
    }
}

