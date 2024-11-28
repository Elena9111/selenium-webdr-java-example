package com.example.selenium.page;

import com.example.selenium.utils.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegistrationPageTest extends BaseTest {

    @Test
    public void testSetButtonRegisterWebElement() {
        registrationPage.setButtonRegisterWebElement();
        registrationPage.setAnotherWayToRegisterButtonWebElement();
        registrationPage.setFieldSurnameWebElement();
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}