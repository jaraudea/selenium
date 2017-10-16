package com.vp.interviews;

public class MacDriverLoader implements DriverLoader {

    @Override
    public void configureChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/mac_chromedriver");
    }

    @Override
    public void configureFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "drivers/mac_geckodriver");
    }
}
