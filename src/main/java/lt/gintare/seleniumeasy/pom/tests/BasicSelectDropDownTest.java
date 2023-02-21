package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicSelectDropDownPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasicSelectDropDownTest {

    @BeforeMethod
    public void setUpDriver() {
        BasicSelectDropDownPage.open();
    }

    @Test
    public void testSelectListDemo() {
        String expectedResult = "Saturday";
        String actualResult;

        BasicSelectDropDownPage.selectDayFromDropDownList(expectedResult);
        actualResult = BasicSelectDropDownPage.readMessageSelectedValue();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }

    @AfterMethod
    public void closeDriver() {
        BasicSelectDropDownPage.close();
    }
}
