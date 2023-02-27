package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicSelectDropDownPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicSelectDropDownTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        BasicSelectDropDownPage.open(
        );
    }

    @Test
    public void testSelectListDemo() {
        String expectedResult = "Sunday";
        String actualResult;

        BasicSelectDropDownPage.selectDayFromDropDownList(expectedResult);
        actualResult = BasicSelectDropDownPage.readMessageSelectedValue();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }
}
