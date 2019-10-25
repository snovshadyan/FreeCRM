package Pages;

import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath="//span[text()='Home']")
    WebElement Home;

    @FindBy(xpath="//span[text()='Calendar']")
    WebElement Calendar;

    @FindBy(xpath="//span[text()='Contacts']")
    WebElement Contacts;

    @FindBy(xpath = "//span[text()='Companies']")
    WebElement Companies;

    @FindBy(xpath="//span[text()='Deals']")
    WebElement Deals;

    @FindBy(xpath="//span[text()='Tasks']")
    WebElement Tasks;

    @FindBy(xpath="//span[text()='Cases']")
    WebElement Cases;

    @FindBy(xpath="//span[text()='Calls']")
    WebElement Calls;

    @FindBy(xpath = "//span[text()='Documents']")
    WebElement Documents;

    @FindBy(xpath="//span[text()='Email']")
    WebElement Email;

    @FindBy(xpath = "//span[text()='Campaigns']")
    WebElement Campaigns;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public boolean verify_Home_Tab() throws Exception{
        Utils.HEY(Home);
        return Home.isDisplayed();
    }


    public boolean verify_Calendar_Tab() throws Exception{
        Utils.HEY(Calendar);
        return Calendar.isDisplayed();
    }


    public boolean verify_Contacts_Tab() throws Exception{
        Utils.HEY(Contacts);
        return Contacts.isDisplayed();
    }



    public boolean verify_Companies_Tab() throws Exception{
        Utils.HEY(Companies);
        return Companies.isDisplayed();
    }


    public boolean verify_Deals_Tab() throws Exception{
        Utils.HEY(Deals);
        return Deals.isDisplayed();
    }


    public boolean verify_Tasks_Tab() throws Exception{
        Utils.HEY(Tasks);
        return Tasks.isDisplayed();
    }


    public boolean verify_Cases_Tab() throws Exception{
        Utils.HEY(Cases);
        return Cases.isDisplayed();
    }


    public boolean verify_Calls_Tab() throws Exception{
        Utils.HEY(Calls);
        return Calls.isDisplayed();
    }


    public boolean verify_Documents_Tab() throws Exception{
        Utils.HEY(Documents);
        return Documents.isDisplayed();
    }


    public boolean verify_Email_Tab() throws Exception{
        Utils.HEY(Email);
        return Email.isDisplayed();
    }


    public boolean verify_Campaigns_Tab() throws Exception{
        Utils.HEY(Campaigns);
        return Campaigns.isDisplayed();
    }















}
