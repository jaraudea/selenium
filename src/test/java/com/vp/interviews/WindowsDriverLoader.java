package com.vp.interviews;

public class WindowsDriverLoader implements DriverLoader {

    @Override
    public void configureChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    }

    @Override
    public void configureFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
    }
}
