package lt.gintare.demoQA.tests;

import lt.gintare.demoQA.pages.ElementsPage;
import lt.gintare.demoQA.pages.HomePage;
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
    public void test() {

    }
}
