package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSetup extends BasePage {
    @Before
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver","src\\Resources\\Browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://demo.nopcommerce.com/");
        System.out.println("user sucssfulley on homepage");
    }
    @After
    public void closeBrowser() {
        //driver.close();
    }
}
