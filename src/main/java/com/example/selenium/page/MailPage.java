package com.example.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ph-whiteline\"]/div/div[2]/div[2]/button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")
    private WebElement nameUserButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")
    private  WebElement namePopApp;

    @FindBy(className = "loginAppPopup")
    private  WebElement popApp;

    public MailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void setLoginButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public void setNameUserButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(nameUserButton));
        nameUserButton.sendKeys("test");
    }

    public void setSwitchTo() throws InterruptedException {
        //Ждем пока элемент появится на странице (всплывающее окно)
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.className("ag-popup__frame__layout__iframe")));
        //Поп апп появился находим его
        WebElement popApp = driver.findElement(By.className("ag-popup__frame__layout__iframe"));
        //Переключаемся в поп апп
        driver.switchTo().frame(popApp);
        //Находим на нем поле
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/div/input"));
        //Вставляем значение
        element.sendKeys("Test");
        //Находим кнопку
        WebElement popButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div/div[1]/button"));
        //Кликаем кнопку
        popButton.click();
    }

    public void setNameInPopApp() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(namePopApp));
        namePopApp.sendKeys("test");

}
}

