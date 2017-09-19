package com.vp.interviews;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ru.stqa.selenium.factory.WebDriverPool;

/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected static URL gridHubUrl = null;
  protected static String baseUrl;
  protected static Capabilities capabilities;

  protected WebDriver driver;

  @BeforeSuite
  public void initTestSuite() throws IOException {
    SuiteConfiguration config = new SuiteConfiguration();
    baseUrl = config.getProperty("site.url");
    if (config.hasProperty("grid.url") && !"".equals(config.getProperty("grid.url"))) {
      gridHubUrl = new URL(config.getProperty("grid.url"));
    }
    capabilities = config.getCapabilities();
  }

  @BeforeMethod
  public void initWebDriver() {
//    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_linux64/chromedriver");
//    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver-v0.17.0-linux64/geckodriver");
    System.setProperty("webdriver.chrome.driver", "drivers/mac_chromedriver");
    System.setProperty("webdriver.gecko.driver", "drivers/mac_geckodriver");
//    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");


    driver = WebDriverPool.DEFAULT.getDriver(gridHubUrl, capabilities);
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    WebDriverPool.DEFAULT.dismissAll();
  }
}
