package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicFirstFormPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasicFirstFormTest {

    @BeforeMethod
    public void setUpDriver() {
        BasicFirstFormPage.open();
    }

    @Test
    public void testSingleInputField_InputMessageGintareInSeleniumEasy() {

        String message = "Gintarė";
        String expectedResult = "Gintarė";
        String actualResult;

        BasicFirstFormPage.enterMessage(message);
        BasicFirstFormPage.clickButtonShowMessage();
        actualResult = BasicFirstFormPage.readMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoInputFieldsValueA_8ValueB_10InSeleniumEasy() {

        String valueA = "8";
        String valueB = "10";
        String expectedResult = "18";
        String actualResult;

        BasicFirstFormPage.enterValueA(valueA);
        BasicFirstFormPage.enterValueB(valueB);
        BasicFirstFormPage.clickButtonGetTotal();
        actualResult = BasicFirstFormPage.readTotal();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @AfterMethod
    public void closeDriver() {
        BasicFirstFormPage.close();
    }
}
