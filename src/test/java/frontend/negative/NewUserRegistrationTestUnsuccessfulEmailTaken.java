package frontend.negative;
import core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.NewUserRegistration;

public class NewUserRegistrationTestUnsuccessfulEmailTaken
        extends
        BaseTest {

    @Test
    public static void NewUserRegistrationTestUnsuccessfulEmailTakenTest() {
        NewUserRegistration.open();
        NewUserRegistration.openRegistrationTab("Y",
                "S", "testfchugygygywosrt@test.com",
                "+35989898989", "123456", "123456");
NewUserRegistration.verifyEmailAlreadyTakenMessage(
        "Warning: E-Mail Address is already registered!",
        "Error, you have an error!");

    }


}
