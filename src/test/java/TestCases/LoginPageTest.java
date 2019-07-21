package TestCases;

import Base.TestBase;
import Pages.LoginPage;
import Utilities.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {


    LoginPage loginpage;
    private static Logger log = LogManager.getLogger(LoginPageTest.class);

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void  setup(ITestResult result){
        loginpage = new LoginPage();
        log.info("Testing " + result.getMethod().getMethodName());
    }



    @Test(priority = 1)
    public void TitleTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Free CRM software for any Business");
    }




    @Test(priority=2)
    public void FB_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyFB_Icon());
    }


    @Test(priority=3)
    public void Twitter_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyTwitter_Icon());
    }


    @Test(priority=4)
    public void ES_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyES_Icon());
    }


    @Test(priority=5)
    public void PT_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyPT_Icon());
    }

    @Test(priority=6)
    public void FR_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyFR_Icon());
    }

    @Test(priority=7)
    public void RU_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyRU_Icon());
    }

    @Test(priority=8)
    public void IT_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyIT_Icon());
    }

    @Test(priority=9)
    public void JP_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyJP_Icon());
    }

    @Test(priority=10)
    public void SignUP_TabTest() throws Exception{

        Assert.assertTrue(loginpage.verify_SignUP_Tab());
    }


    @Test(priority=11)
    public void About_TabTest() throws Exception{

        Assert.assertTrue(loginpage.verify_About_Tab());
    }

    @Test(priority=12)
    public void CRM_TabTest() throws Exception{

        Assert.assertTrue(loginpage.verify_CRM_Tab());
    }


    @Test(priority=13)
    public void Compare_TabTest() throws Exception{

        Assert.assertTrue(loginpage.verify_Compare_Tab());
    }


    @Test(priority=14)
    public void Pricing_TabTest() throws Exception{

        Assert.assertTrue(loginpage.verify_Pricing_Tab());
    }



    @Test(priority=15)
    public void iTunes_iconTest() throws Exception{

        Assert.assertTrue(loginpage.verify_iTunes_icon());
    }



    @Test(priority=16)
    public void Android_iconTest() throws Exception{

        Assert.assertTrue(loginpage.verify_Android_icon());
    }



    @Test(priority=17)
    public void LogIn_BtnTest() throws Exception{

        Assert.assertTrue(loginpage.verify_LogIn_Btn());
    }


    @Test(priority=18)
    public void SignUP_BtnTest() throws Exception{

        Assert.assertTrue(loginpage.verify_SignUP_Btn());
    }



    @Test(priority = 19)
    public void LoginTest() throws Exception{

        Assert.assertTrue(loginpage.verify_Login());
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
