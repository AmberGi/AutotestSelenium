package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicRadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicRadioButtonTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        BasicRadioButtonPage.open();
    }

    @Test
    public void testRadioButtonMale() {
        String expectedResult = "Male";
        String actualResult;

        BasicRadioButtonPage.clickRadioButtonGender(expectedResult);
        BasicRadioButtonPage.clickButtonGetCheckedValue();
        actualResult = BasicRadioButtonPage.getSingleResponseMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }
}
