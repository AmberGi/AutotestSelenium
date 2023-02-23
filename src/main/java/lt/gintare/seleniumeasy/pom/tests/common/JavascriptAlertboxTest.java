package lt.gintare.seleniumeasy.pom.tests.common;

import lt.gintare.seleniumeasy.pom.pages.JavascriptAlertboxPage;
import lt.gintare.seleniumeasy.pom.tests.BaseTest;
import lt.gintare.seleniumeasy.pom.tests.common.Buttons;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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

    @DataProvider(name = "dataProviderForTestConfirmBox")
    public Object[][] dataProviderForConfirmBox() {
        return new Object[][]{
                {Buttons.OK, "OK"},
                {Buttons.CANCEL, "Cancel"}
        };
    }

    @Test(dataProvider = "dataProviderForTestConfirmBox")
    public void testConfirmBox(Buttons clickButton, String expectedResult) {
        String actualResult;

        JavascriptAlertboxPage.clickButtonMyConfirm();
        JavascriptAlertboxPage.clickOnConfirmBox(clickButton);
        actualResult = JavascriptAlertboxPage.readMessageMyConfirm();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }
}



