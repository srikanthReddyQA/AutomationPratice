package UIPages;

import Library.Base;

import Library.Util;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Base {



    public static  void launchApplication(String browser){
        lanchapp(CommVar_Url);

    driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

        System.out.println("launch the application");
    }

    public static  void SelectCountry(String browser){

        System.out.println("user enter select contry name ");
    }


    public static  void releventdata(){
        System.out.println("releventdata");
    }


    public static  void allowUser(){
        System.out.println("allowUser");
    }

}
