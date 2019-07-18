package Pages;

import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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








    public LoginPage(){
        PageFactory.initElements(driver, this);
    }


    public boolean verifyFB_Icon() throws Exception{
        Utils.HEY(FB_icon);
        return FB_icon.isDisplayed();
    }


    public boolean verifyTwitter_Icon() throws Exception{
        Utils.HEY(Twitter_icon);
        return Twitter_icon.isDisplayed();
    }


    public boolean verifyES_Icon() throws Exception{
        Utils.HEY(ES_icon);
        return ES_icon.isDisplayed();
    }


    public boolean verifyPT_Icon() throws Exception{
        Utils.HEY(PT_icon);
        return PT_icon.isDisplayed();
    }



    public boolean verifyFR_Icon() throws Exception{
        Utils.HEY(FR_icon);
        return FR_icon.isDisplayed();
    }



    public boolean verifyRU_Icon() throws Exception{
        Utils.HEY(RU_icon);
        return RU_icon.isDisplayed();
    }



    public boolean verifyIT_Icon() throws Exception{
        Utils.HEY(IT_icon);
        return IT_icon.isDisplayed();
    }



    public boolean verifyJP_Icon() throws Exception{
        Utils.HEY(JP_icon);
        return JP_icon.isDisplayed();
    }
















}
