package lt.gintare.seleniumeasy.pom.tests;

import lt.gintare.seleniumeasy.pom.pages.BasicRadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

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

    @Test
    public void testGroupRadioButtonFemale5to15() {
        String expectedResultGenderGroup = "Female";
        String expectedResultAgeGroup = "5 - 15";
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
