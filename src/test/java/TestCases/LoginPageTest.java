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





    @Test(priority=1)
    public void FB_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyFB_Icon());

    }


    @Test(priority=2)
    public void Twitter_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyTwitter_Icon());

    }


    @Test(priority=3)
    public void ES_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyES_Icon());

    }


    @Test(priority=4)
    public void PT_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyPT_Icon());

    }

    @Test(priority=5)
    public void FR_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyFR_Icon());

    }

    @Test(priority=6)
    public void RU_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyRU_Icon());

    }

    @Test(priority=7)
    public void IT_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyIT_Icon());

    }

    @Test(priority=8)
    public void JP_IconTest() throws Exception{

        Assert.assertTrue(loginpage.verifyJP_Icon());

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
