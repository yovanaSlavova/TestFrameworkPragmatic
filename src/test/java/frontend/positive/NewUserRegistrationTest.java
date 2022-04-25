package frontend.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.NewUserRegistration;

public class NewUserRegistrationTest extends BaseTest {

    @Test
    public void newUserRegistration(){
        NewUserRegistration.open();
        NewUserRegistration.openRegistrationTab("Y",
                "S", "testfcnidfhewosrt125854@test.com",
                "+35989898989", "123456", "123456");
NewUserRegistration.verifySuccessfulRegistration("Your " +
        "Account Has Been Created!\n", "This registration" +
        " was not successful.");
    }


}
