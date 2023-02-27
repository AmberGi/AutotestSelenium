package lt.gintare.demoQA.tests;

import lt.gintare.demoQA.pages.DynamicPropertiesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        DynamicPropertiesPage.open();
    }

    @Test

    public void clickButtonVisibleAfter() {
        DynamicPropertiesPage.clickButtonVisibleAfter();
        DynamicPropertiesPage.sleep(3000);

    }
}
