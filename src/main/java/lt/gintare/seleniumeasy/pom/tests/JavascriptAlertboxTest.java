package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.JavascriptAlertboxPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptAlertboxTest extends BaseTest {


    @BeforeMethod
    @Override
    public void setUp() {
        JavascriptAlertboxPage.open();
    }

    @Test
    public void testCloseAlertBox() {
        boolean expectedResult = false;
        boolean actualResult;

        JavascriptAlertboxPage.clickButtonMyAlert();
        JavascriptAlertboxPage.sleep(3000);

        JavascriptAlertboxPage.clickOkOnAlertBox();
        JavascriptAlertboxPage.sleep(3000);

        actualResult = JavascriptAlertboxPage.isAlertBoxIsPresent();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
