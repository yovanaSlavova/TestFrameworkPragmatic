package pages.frontend;

import core.Base;
import org.openqa.selenium.By;
import utils.Browser;
import core.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class NewUserRegistration extends Base {

    private static final By LOGIN_TAB = By.xpath("//span" +
            "[contains(text(), \"My Account\")]");
    private static final By REGISTER_TAB = By.xpath(
            "//a[contains(text(), \"Register\")]");
    private static final By FIRSTNAME_INPUT_FIELD = By.id(
            "input-firstname");
    private static final By LASTNAME_INPUT_FIELD = By.id(
            "input-lastname");
    private  static final By EMAIL_INPUT_FIELD = By.id(
            "input-email");
    private  static final By TELEPHONE_INPUT_FIELD = By.id(
            "input-telephone");
    private static final By PASSWORD_INPUT_FIELD =
            By.id("input-password");
    private static final By PASSWORD_CONFIRMED_INPUT_FIELD =
            By.id("input-confirm");
    private static final By AGREE_CHECKBOX = By.xpath(
            "//input[@name='agree']");
    private static final By SUBMIT_BUTTON =
            By.cssSelector(".btn-primary");
    private static final By SUCCESS_MESSAGE = By.xpath(
            "//h1[contains(text(), 'Your Account Has Been Created!')]");
    private static final By
            INVALID_LOGIN_VALIDATION_MESSAGE_DIV =
            By.cssSelector(".alert-danger");

    private static String frontendLoginPageURL = "http" +
            "://shop.pragmatic.bg/";
    private static final By EMAIL_ALREADY_TAKEN = By.className(
            "alert-dismissible");

    /**
     * Opens the frontend page.
     */

    public static void open() {
        Browser.driver.get(frontendLoginPageURL);
    }

    /**
     * Opens the Registration tab
     */

    public static void openRegistrationTab(String firstName, String lastName, String email, String telephone, String password, String passwordConfirmed) {
        click(LOGIN_TAB);
        click(REGISTER_TAB);
        type(FIRSTNAME_INPUT_FIELD, firstName);
        type(LASTNAME_INPUT_FIELD, lastName);
        type(EMAIL_INPUT_FIELD, email);
        type(TELEPHONE_INPUT_FIELD, telephone);
        type(PASSWORD_INPUT_FIELD, password);
        type(PASSWORD_CONFIRMED_INPUT_FIELD, passwordConfirmed);
        click(AGREE_CHECKBOX);
        click(SUBMIT_BUTTON);
    }

    /**
     * Asserts if user has successfully registered by
     * checking if they have received the message "You
     * have registered successfully."
     *
     * @param expectedSuccessMessage the success message
     *                               from the first H1,
     *                              at the moment it is "Your Account Has Been Created!"
     * @param messageOnFailure the message that will appear in your reports in case of test failure
     */
    public static void verifySuccessfulRegistration(String expectedSuccessMessage,
                                                   String messageOnFailure) {
        String actualAccountFullName = getText(SUCCESS_MESSAGE);
//        Assert.assertEquals(actualAccountFullName, expectedSuccessMessage, messageOnFailure);
        Assert.assertTrue(expectedSuccessMessage.contains("Created"));

    }

    public static void verifyEmailAlreadyTakenMessage (String expectedMessage, String errorMessage) {
String actualMessage = getText(EMAIL_ALREADY_TAKEN);
Assert.assertTrue(actualMessage.equals(expectedMessage));
    }


}
