package com.company.tests;

import com.company.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testLogin()
    {
        FrameworkConfig config= ConfigCache.getOrCreate(FrameworkConfig.class);
        System.out.println(config.browser());
       /* WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();*/



    }
}
