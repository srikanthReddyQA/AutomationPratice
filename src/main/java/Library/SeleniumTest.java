package Library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SeleniumTest {
static WebDriver dd;

    //JavascriptExecutor js = (JavascriptExecutor)dd;

    public  static  void ss() {
        JavascriptExecutor executor = (JavascriptExecutor) dd;
        executor.executeScript("arguments[0].click();", "");

    }
}
