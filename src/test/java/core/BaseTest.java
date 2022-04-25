package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        Browser.open();
    }

    @AfterMethod
    public void tearDown(){
        Browser.quit();
    }
}
