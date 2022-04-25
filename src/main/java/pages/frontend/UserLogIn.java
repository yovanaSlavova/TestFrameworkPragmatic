package pages.frontend;

import core.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class UserLogIn extends Base {

    private static String LoginPageURL = "http://shop.pragmatic.bg/";


    //private static String email = "testfcnidfhewosrt@test.com";
    //private static String password = "123456";
    private static final By ACCOUNT_TAB = By.xpath(
            "//span" +
            "[contains(text(), \"My Account\")]");
    private static final By LOGIN_TAB = By.xpath(
            "//a[contains(text(), \"Login\")]");
    private static final By EMAIL_FIELD = By.id("input-email");
    private static final By PASSWORD_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.xpath("//input[@class='btn btn-primary']");
private static By accountVerificationHeading = By.xpath("//h2" +
        "[contains" +
        "(text(), 'Orders')]");

public static void open() {
    Browser.driver.get(LoginPageURL);
}

    public static void logIn(String email,
                              String password) {
    click(ACCOUNT_TAB);
        click(LOGIN_TAB);
      type(EMAIL_FIELD, email);
      type(PASSWORD_FIELD, password);
      click(LOGIN_BUTTON);

    }

    /**
     * Verifies successful login by checking one of the
     * h2 texts on the page, in this case - "My Orders"
     * @param expectedText is usually "My Orders"
     * @param errorMessage should notify if/why the test
     *                     has failed
     */

    public static void verifySuccessfulLogin (String expectedText, String errorMessage) {
        String textOnPage = getText(accountVerificationHeading);
        Assert.assertEquals(expectedText, textOnPage, errorMessage);
    }
}
