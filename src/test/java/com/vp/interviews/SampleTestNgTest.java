package com.vp.interviews;

import org.testng.annotations.*;

public class SampleTestNgTest extends TestNgTestBase {


    @BeforeClass
    public void setup() {

    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @Test
    public void testAviancaBooking() {
        driver.get(baseUrl);
    }

    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void cleanUp() {
    }

}
