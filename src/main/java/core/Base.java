package core;

import org.openqa.selenium.By;
import utils.Browser;

import java.util.Random;

public class Base {

    protected static void click(By locator) {
        Browser.driver.findElement(locator).click();
    }

    protected static String getText(By locator) {
       return Browser.driver.findElement(locator).getText();
    }

    protected static void type(By locator, String textToType) {
        Browser.driver.findElement(locator).sendKeys(textToType);
    }

/*    protected static String random()
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String randomEmail = "" + randomInt + "" + "@" +
                "" + randomInt + ".com";
        return randomEmail;
    }*/
}
