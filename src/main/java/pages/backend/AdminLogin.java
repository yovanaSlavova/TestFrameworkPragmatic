package pages.backend;

import core.Base;
//import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.testng.Assert;

import utils.Browser;

public class AdminLogin extends Base {

    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector(".btn-primary");
    private static final By INVALID_LOGIN_VALIDATION_MESSAGE_DIV = By.cssSelector(".alert-danger");
    private static String adminLoginPageURL = "http://shop.pragmatic.bg/admin";


    /**
     * Opens the URL of shop.pragmatic.bg/admin
     */
    public static void open() {
        Browser.driver.get(adminLoginPageURL);
    }


    /**
     * Logs into the admin area with the provided credentials
     *
     * @param username the username you would like to login with
     * @param password the password you would like to login with
     */
    public static void login(String username, String password) {
        type(USERNAME_INPUT_FIELD, username);
        type(PASSWORD_INPUT_FIELD, password);
        click(LOGIN_BUTTON);
    }


    /**
     * Asserts if the message that appears after you provide wrong login credentials is as we expect
     * @param expectedInvalidLoginValidationMessage the validation message that we expect to be shown above the login form
     * @param messageOnFailure the message that will appear in your reports in case if test failure
     */
    public static void verifyInvalidLoginValidationMessage(String expectedInvalidLoginValidationMessage, String messageOnFailure) {
        String actualInvalidLoginValidationMessage = getText(INVALID_LOGIN_VALIDATION_MESSAGE_DIV).trim();
        Assert.assertTrue(actualInvalidLoginValidationMessage.contains(expectedInvalidLoginValidationMessage),
                (messageOnFailure));
    }
}
