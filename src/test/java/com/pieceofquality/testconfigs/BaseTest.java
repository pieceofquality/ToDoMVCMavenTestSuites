package com.pieceofquality.testconfigs;

import com.codeborne.selenide.Configuration;


public class BaseTest {

    static {
        Configuration.browser = System.getProperty("driver.browser");
    }
}
