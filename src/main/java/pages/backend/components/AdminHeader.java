package pages.backend.components;

import core.Base;
import org.openqa.selenium.By;
import org.testng.Assert;


public class AdminHeader extends Base {

    private static final By ACCOUNT_FULL_NAME_LINK = By.cssSelector("li.dropdown > a.dropdown-toggle");

    /**
     * Asserts if the full name of the account that is shown in the header menu in the admin area
     * that is next to the Logout button is as we expect
     *
     * @param expectedAccountFullName the first and last name(full name) that you expect to be shown in the header
     * @param messageOnFailure the message that will appear in your reports in case of test failure
     */
    public static void verifyAccountFullName(String expectedAccountFullName, String messageOnFailure) {
        String actualAccountFullName = getText(ACCOUNT_FULL_NAME_LINK);
        Assert.assertEquals(actualAccountFullName, expectedAccountFullName, messageOnFailure);

    }
}
