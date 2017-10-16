package com.vp.interviews;

public class LinuxDriverLoader implements DriverLoader {

    @Override
    public void configureChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/linux64_chromedriver");
    }

    @Override
    public void configureFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "drivers/linux64_geckodriver");
    }
}
