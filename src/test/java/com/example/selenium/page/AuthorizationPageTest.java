package com.example.selenium.page;

import com.example.selenium.utils.BaseTest;
import org.testng.annotations.Test;

public class AuthorizationPageTest extends BaseTest {

    @Test
    public void testSetNameUser() {
        try {
            authorizationPage.setNameUser("test");
            authorizationPage.setPassword("1234");
            authorizationPage.setButtonWebElement();
            authorizationPage.setQrCodeWebElementWebElement();
            Thread.sleep(10_000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
