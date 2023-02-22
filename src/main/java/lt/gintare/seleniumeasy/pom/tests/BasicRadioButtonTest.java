package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicRadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.*;

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

    @DataProvider(name = "dataProviderForTestGroupRadioButton")
    public Object[][] dataProviderForGroupRadioButton() {
        return new Object[][]{
                {"Male", "0 - 5"},
                {"Male", "5 - 15"},
                {"Male", "5 - 15"},
                {"Female", "0 - 5"},
                {"Female", "5 - 15"},
                {"Female", "15 - 50"}
        };
    }

    @Test(dataProvider = "dataProviderForTestGroupRadioButton")
    public void testGroupRadioButton(String expectedResultGenderGroup,
                                     String expectedResultAgeGroup) {
        String actualResult;

        BasicRadioButtonPage.clickGroupRadioButtonGenderGroup(expectedResultGenderGroup);
        BasicRadioButtonPage.clickGroupRadioButtonAgeGroup(expectedResultAgeGroup);
        BasicRadioButtonPage.clickGroupRadioButtonGetValues();

        actualResult = BasicRadioButtonPage.getValuesResposeMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResultGenderGroup),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResultGenderGroup)
        );

        Assert.assertTrue(
                actualResult.contains(expectedResultAgeGroup),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResultAgeGroup)
        );
    }
}
