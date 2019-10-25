package Pages;

import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {



@FindBy(xpath = "//a[@title='Facebook Free CRM Page']")
    WebElement FB_icon;

@FindBy(xpath = "//a[@title='Twitter Free CRM Page']")
    WebElement Twitter_icon;

@FindBy(xpath="//a[@title='Spanish Free CRM']")
    WebElement ES_icon;

@FindBy(xpath="//a[@title='Portuguese Free CRM']")
    WebElement PT_icon;

@FindBy(xpath="//a[@title='French Free CRM']")
    WebElement FR_icon;

@FindBy(xpath="//a[@title='Russian Free CRM']")
    WebElement RU_icon;

@FindBy(xpath="//a[@title='Italian Free CRM']")
    WebElement IT_icon;

@FindBy(xpath="//a[@title='Japan Free CRM']")
    WebElement JP_icon;

@FindBy(xpath="//a[text()='Sign Up']")
    WebElement SignUP;

@FindBy(xpath="//a[text()='About']")
    WebElement About;

@FindBy(xpath="//a[text()='CRM']")
    WebElement CRM;

@FindBy(xpath="//a[text()='Compare']")
    WebElement Compare;

@FindBy(xpath="//a[text()='Pricing']")
    WebElement Pricing;

@FindBy(xpath="//img[@title='free crm app for itunes']")
    WebElement iTunes;

@FindBy(xpath="//img[@title='app for freecrm android']")
    WebElement Android;

@FindBy(xpath="//span[text()='Log In']")
WebElement LogIn_Btn;

@FindBy(xpath="//a[@href='https://register.freecrm.com/register/']")
WebElement SignUP_Btn;

@FindBy(xpath="//div[text()='Login']")
WebElement Login_Btn;

@FindBy(xpath="//input[@name='email']")
WebElement Email;

@FindBy(xpath="//input[@name='password']")
WebElement Password;

@FindBy(xpath="//span[text()='Home']")
WebElement Home;


    public LoginPage(){
        PageFactory.initElements(driver, this);
    }


    public boolean verifyFB_Icon() throws Exception{
        //Utils.HEY(FB_icon);
        return FB_icon.isDisplayed();
    }


    public boolean verifyTwitter_Icon() throws Exception{
        //Utils.HEY(Twitter_icon);
        return Twitter_icon.isDisplayed();
    }


    public boolean verifyES_Icon() throws Exception{
        //Utils.HEY(ES_icon);
        return ES_icon.isDisplayed();
    }


    public boolean verifyPT_Icon() throws Exception{
        //Utils.HEY(PT_icon);
        return PT_icon.isDisplayed();
    }



    public boolean verifyFR_Icon() throws Exception{
        //Utils.HEY(FR_icon);
        return FR_icon.isDisplayed();
    }



    public boolean verifyRU_Icon() throws Exception{
        //Utils.HEY(RU_icon);
        return RU_icon.isDisplayed();
    }



    public boolean verifyIT_Icon() throws Exception{
        //Utils.HEY(IT_icon);
        return IT_icon.isDisplayed();
    }



    public boolean verifyJP_Icon() throws Exception{
        //Utils.HEY(JP_icon);
        return JP_icon.isDisplayed();
    }



    public boolean verify_SignUP_Tab() throws Exception{
        //Utils.HEY(SignUP);
        return SignUP.isDisplayed();
    }



    public boolean verify_About_Tab() throws Exception{
        //Utils.HEY(About);
        return About.isDisplayed();
    }



    public boolean verify_CRM_Tab() throws Exception{
        //Utils.HEY(CRM);
        return CRM.isDisplayed();
    }



    public boolean verify_Compare_Tab() throws Exception{
        //Utils.HEY(Compare);
        return Compare.isDisplayed();
    }



    public boolean verify_Pricing_Tab() throws Exception{
        //Utils.HEY(Pricing);
        return Pricing.isDisplayed();
    }


    public boolean verify_iTunes_icon() throws Exception{
        //Utils.HEY(iTunes);
        return iTunes.isDisplayed();
    }


    public boolean verify_Android_icon() throws Exception{
        //Utils.HEY(Android);
        return Android.isDisplayed();
    }

    public boolean verify_LogIn_Btn() throws Exception{
        //Utils.HEY(LogIn_Btn);
        return LogIn_Btn.isDisplayed();
    }

    public boolean verify_SignUP_Btn() throws Exception{
        //Utils.HEY(SignUP_Btn);
        return SignUP_Btn.isDisplayed();
    }


    public boolean verify_Login() throws Exception{

        //Utils.HEY(LogIn_Btn);
        LogIn_Btn.click();
        Utils.WFEV(By.xpath("//div[text()='Login']"));
        Email.sendKeys(prop.getProperty("Email"));
        Password.sendKeys(prop.getProperty("Password"));
        Login_Btn.click();
        Utils.WFEV(By.xpath("//span[text()='Home']"));
        return Home.isDisplayed();



    }

}
