package com.example.selenium.driver;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

class ChromeOptionsFactory {

    ChromeOptions build(){

        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("start-maximized");
        optionsChrome.addArguments("lang=pt-BR", "window-size=1920x935");
        optionsChrome.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors,--web-security=false,--ssl-protocol=any,--ignore-ssl-errors=true"));
        optionsChrome.setAcceptInsecureCerts(true);

        return optionsChrome;
    }
}
