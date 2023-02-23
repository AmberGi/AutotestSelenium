package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicRadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicRadioButtonTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        BasicRadioButtonPage.open();
    }

    @DataProvider(name = "dataProviderForTestRadioButton")
    public Object[][] dataProviderForRadioButton() {
        return new Object[][]{
                {"Male", "Male"},
                {"Female", "Female"}
        };
    }

    @Test(dataProvider = "dataProviderForTestRadioButton")
    public void testRadioButton(String clickGender, String expectedResult) {
        String actualResult;

        BasicRadioButtonPage.clickRadioButtonGender(clickGender);
        BasicRadioButtonPage.clickButtonGetCheckedValue();
        actualResult = BasicRadioButtonPage.getSingleResponseMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }

    @DataProvider(name = "dataProviderForTestGroupRadioButton", parallel = true)
    public Object[][] dataProviderForGroupRadioButton() {
        return new Object[][]{
                {"Male", "Male", "0 - 5", "0 - 5"},
                {"Male", "Male", "5 - 15", "5 - 15"},
                {"Male", "Male", "15 - 50", "15 - 50"},
                {"Female", "Female", "0 - 5", "0 - 5"},
                {"Female", "Female", "5 - 15", "5 - 15"},
                {"Female", "Female", "15 - 50", "15 - 50"},
        };
    }

    @Test(dataProvider = "dataProviderForTestGroupRadioButton", threadPoolSize = 3)
    public void testGroupRadioButton(String clickGenderGroup,
                                     String expectedResultGenderGroup,
                                     String clickAgeGroup,
                                     String expectedResultAgeGroup) {
        String actualResult;

        BasicRadioButtonPage.clickGroupRadioButtonGenderGroup(clickGenderGroup);
        BasicRadioButtonPage.clickGroupRadioButtonAgeGroup(expectedResultAgeGroup);
        BasicRadioButtonPage.clickGroupRadioButtonGetValues();

        actualResult = BasicRadioButtonPage.getValuesResposeMessage();

        Assert.assertTrue(
                actualResult.contains(clickGenderGroup),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResultGenderGroup)
        );

        Assert.assertTrue(
                actualResult.contains(clickAgeGroup),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResultAgeGroup)
        );
    }
}
