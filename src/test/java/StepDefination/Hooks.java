package StepDefination;



import Library.Util;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Hooks  extends Util {

@Before
    public void beforeMethod() {
    Properties prop = new Properties();
    InputStream input;
    try {
        input = new FileInputStream("src/test/resources/configProperties/appConfig.properties");
        prop.load(input);
    } catch (Exception e) {
        System.out.println("Unable to load data from configuraton.properties file");
    }

    CommVar_Url=prop.getProperty("Url");

    driver = Lanchbrowser("chrome");
















    System.out.println("Bef0re test");





    }
    @After
    public void afterMethod() {
        //driver.close();
    System.out.println("After test");
    }

    @AfterSuite
  static void tearDown() {
        System.out.println("after suite---------------------");
    }
}
