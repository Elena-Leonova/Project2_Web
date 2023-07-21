package tests;

import applications.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class TestBase {
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));
@BeforeMethod (alwaysRun = true)
    public void startLogger(Method method){
        logger.info("Test start --> " + method.getName());
    }

    @AfterMethod (alwaysRun = true)
    public void finishLogger(){
    logger.info("============================================================");
    }
    @BeforeClass (alwaysRun = true)
    public void setUp(){

       app.init();
    }
@AfterClass (alwaysRun = true)
    public void tearDown(){
       app.stop();
    }

}
