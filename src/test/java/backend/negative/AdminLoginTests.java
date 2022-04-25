package backend.negative;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.backend.AdminLogin;

public class AdminLoginTests extends BaseTest {

    @Test
    public void unsuccessfulLogin() {
        AdminLogin.open();
        AdminLogin.login("asdasdasdfasdf", "dasfafasf");
        AdminLogin.verifyInvalidLoginValidationMessage("No match for Username and/or Password.",
                "The expected validation message when provided wrong credentials to login was not shown as expected.");
    }



}
