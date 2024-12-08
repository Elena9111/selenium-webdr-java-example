package com.example.selenium.page;

import com.example.selenium.utils.BaseTest;
import org.testng.annotations.Test;

public class MailPageTest extends BaseTest {

    @Test
    public void testSetLoginButton() {
        try {
            mailPage.setLoginButton();
//            mailPage.setNameUserButton();
            mailPage.setSwitchTo();
//            mailPage.setNameInPopApp();

            Thread.sleep(10_000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}