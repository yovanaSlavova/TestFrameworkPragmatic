package frontend.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.UserLogIn;


public class UserLogInTest extends BaseTest {

    @Test
    public void userLogInTest () {
        UserLogIn.open();
        UserLogIn.logIn("testfcnidfhewosrt@test.com", "123456");
        UserLogIn.verifySuccessfulLogin("My Orders",
                "Error message! Your test has failed.");

    }

}
