package TestCases;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homepage;
    LoginPage loginpage;
    private static Logger log = LogManager.getLogger(LoginPageTest.class);

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void  setup(ITestResult result){
        homepage = new HomePage();
        loginpage = new LoginPage();
        log.info("Testing " + result.getMethod().getMethodName());
    }




    @Test(priority = 1)
    public void LoginTest() throws Exception{

        Assert.assertTrue(loginpage.verify_Login());
    }


    @Test(priority = 2)
    public void TitleTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "CRM");
    }




    @Test(priority=3)
    public void Home_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Home_Tab());
    }


    @Test(priority=4)
    public void Calendar_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Calendar_Tab());
    }


    @Test(priority=5)
    public void Contacts_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Contacts_Tab());
    }

    @Test(priority=6)
    public void Companies_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Companies_Tab());
    }


    @Test(priority=7)
    public void Deals_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Deals_Tab());
    }

    @Test(priority=8)
    public void Tasks_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Tasks_Tab());
    }


    @Test(priority=9)
    public void Cases_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Cases_Tab());
    }


    @Test(priority=10)
    public void Calls_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Calls_Tab());
    }

    @Test(priority=11)
    public void Documents_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Documents_Tab());
    }


    @Test(priority=12)
    public void Email_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Email_Tab());
    }

    @Test(priority=13)
    public void Campaigns_Tab_Test() throws Exception{

        Assert.assertTrue(homepage.verify_Campaigns_Tab());
    }




    @AfterMethod
    public void getResults(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            Utils.captureScreenshot(driver, result.getMethod().getMethodName() );
            log.info("Test: " + result.getMethod().getMethodName() + " == Failed");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            log.info("Test: " + result.getMethod().getMethodName() + " == Passed");
        } else if (result.getStatus() == ITestResult.SKIP){
            log.info("Test: " + result.getMethod().getMethodName() + " == Skipped");

        }
    }


}
