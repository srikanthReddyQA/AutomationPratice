package UIPages;

import Library.Base;
import objRep.LoginObjects;

import java.util.concurrent.TimeUnit;

public class GmailLogin extends Base {


    public static  void launchGmailApplication(String browser){
        lanchapp(CommVar_Url);
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
        System.out.println(" launch the gmail application");
    }

    public static  void enterUserNameandPassword(String usename ,String password){

        settext(LoginObjects.Log_UserName,usename);
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        click(LoginObjects.Log_Button);
        settext(LoginObjects.Log_Password,password);

        System.out.println(" enter user and pass");
    }
    public static  void click(){

        click(LoginObjects.Log_Button);
        System.out.println(" click on login button");
    }
    public static  void gmailHomeScrenn(){
       boolean cc= displayed(LoginObjects.gmail_img);
       System.out.println(cc);
        System.out.println(" gmail application home screen");
    }




}
