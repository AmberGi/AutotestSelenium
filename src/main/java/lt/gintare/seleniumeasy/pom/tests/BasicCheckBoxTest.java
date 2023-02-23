package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicCheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicCheckBoxTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
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

    @Test
    public void testMultipleCheckBoxDemo() {
        boolean isCheckBoxChecked = true;
        boolean expectedAllElementsChecked = true;
        boolean actualAllElementsChecked;

        BasicCheckBoxPage.clickButtonCheckAll();
        actualAllElementsChecked = BasicCheckBoxPage.checkSelectedStatusOfAllCheckBoxes(isCheckBoxChecked);

        Assert.assertTrue(actualAllElementsChecked == expectedAllElementsChecked
        );
    }

    @Test
    public void testButtonAttributeOnClick(){
        String attributeName = "value";
        String expectedResult = "Uncheck All";
        String actualResult;

        BasicCheckBoxPage.clickButtonCheckAll();
        actualResult = BasicCheckBoxPage.getButtonAttributeOutcome(attributeName);

        Assert.assertEquals (actualResult, expectedResult);
    }
}
