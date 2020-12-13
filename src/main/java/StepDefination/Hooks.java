package StepDefination;



import Library.Util;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class Hooks  extends Util {
    Properties prop = new Properties();
    InputStream input;
@Before
//@BeforeSuite
    public void beforeMethod() {

    try {
        input = new FileInputStream("src/test/resources/configProperties/appConfig.properties");
        prop.load(input);
    } catch (Exception e) {
        System.out.println("Unable to load data from configuraton.properties file");
    }

    CommVar_currentfolder = System.getProperty("user.dir") + "\\Results";

    // create folder with date and time stamp
    DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
    String DateTimeStamp = dateTimeInstance.format(Calendar.getInstance().getTime());
    DateTimeStamp = DateTimeStamp.replace(",", "");
    DateTimeStamp = DateTimeStamp.replace(" ", "_");
    DateTimeStamp = DateTimeStamp.replace(":", "-");
    CommVar_currentfolder = CommVar_currentfolder + "\\" + DateTimeStamp;

    File dir = new File(CommVar_currentfolder);
    dir.mkdir();
    ScreenshotsFolderPath = CommVar_currentfolder + "\\Screenshorts";
    File dir1 = new File(CommVar_currentfolder);
    dir1.mkdir();

    CommVar_DataFilesPath = System.getProperty("user.dir") + "\\DataFile";

    //TestReport = new ExtentReports(CommVar_currentfolder + "\\Summary.html", true);




    CommVar_Url=prop.getProperty("Url");
    driver = Lanchbrowser("chrome");

    System.out.println("before suite");
    }

    @After
    public void afterMethod() {
        driver.close();
    System.out.println("After Method");
    }
}
