package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicCheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasicCheckBoxTest {

    @BeforeMethod
    public void setUpDriver() {
        BasicCheckBoxPage.open();
    }

    @Test
    public void testSingleCheckBoxDemo() {
        String expectedResult = "Success";
        String actualResult;

        BasicCheckBoxPage.clickSingleCheckBox();
        actualResult = BasicCheckBoxPage.readMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }

    @AfterMethod
    public void closeDriver() {
        BasicCheckBoxPage.close();
    }
}
