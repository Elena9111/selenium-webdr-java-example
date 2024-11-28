package com.example.selenium.utils;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.example.selenium.driver.DriverFactory;
import com.example.selenium.page.AuthorizationPage;
import com.example.selenium.page.RegistrationPage;
import com.example.selenium.report.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.example.selenium.utils.PropertyLoader.returnConfigValue;

@Listeners({ExtentITestListenerClassAdapter.class, ReportListener.class})
public abstract class BaseTest {

    protected static WebDriver driver;
    protected AuthorizationPage authorizationPage;
    protected RegistrationPage registrationPage;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void preCondition() {
        driver = new DriverFactory().createInstance();
        driver.manage().window().maximize();
        driver.get(returnConfigValue("url.base"));
        authorizationPage = new AuthorizationPage(driver);


        registrationPage= new RegistrationPage(driver);

    }

    @AfterMethod
    public void postCondition(){
        driver.quit();
    }
}