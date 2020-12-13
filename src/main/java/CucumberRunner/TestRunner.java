package CucumberRunner;

import Library.Base;
import Library.ComnVab;
import Library.Util;
import com.relevantcodes.extentreports.ExtentReports;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue="StepDefination",

        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"})

       // plugin ={"pretty","json:target/cucumber.json",
       // "html:target/cucumber-html-report"})



public class TestRunner extends AbstractTestNGCucumberTests {
    

    
}

