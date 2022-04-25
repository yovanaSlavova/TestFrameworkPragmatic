package backend.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.backend.AdminLogin;
import pages.backend.components.AdminHeader;

public class AdminLoginTests extends BaseTest {

    @Test
    public void successfulLogin() {

        AdminLogin.open();
        AdminLogin.login("admin", "parola123!");
        AdminHeader.verifyAccountFullName("Milen Strahinski",
                 "You were unable to login as we did not found the name Milen Strahinski");
    }


}
