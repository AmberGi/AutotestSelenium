package lt.gintare.demoQA.tests;

import lt.gintare.demoQA.pages.ButtonsPage;
import lt.gintare.demoQA.pages.ElementsPage;
import lt.gintare.demoQA.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickMenuElements();
        ElementsPage.clickMenuButtons();
    }

    @Test
    public void testButtonDoubleClick() {
        String expectedResult = "double click";
        String actualResult;

        ButtonsPage.doubleClickOnButton();
        actualResult = ButtonsPage.readMessageDoubleClick();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }

    @Test
    public void testButtonRightClick(){
        String expectedResult = "right click";
        String actualResult;

        ButtonsPage.rightClickOnButton();
        actualResult = ButtonsPage.readMessageRightClick();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }
}
