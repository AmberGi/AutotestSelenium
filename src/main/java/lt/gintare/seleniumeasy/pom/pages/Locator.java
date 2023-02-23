package lt.gintare.seleniumeasy.pom.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class BasicFirstForm {

        public static By inputUserMessage = By.xpath("//input[@id='user-message']");
        public static By buttonShowMessage = By.xpath("//button[@onclick='showInput();']");
        public static By spanDisplayMessage = By.xpath("//span[@id='display']");
        public static By inputValueA = By.xpath("//input[@id='sum1']");
        public static By inputValueB = By.xpath("//input[@id='sum2']");
        public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
        public static By spanDisplayTotal = By.xpath("//*[@id='displayvalue']");
    }

    public static class BasicCheckBox {
        public static By checkBoxSingle = By.xpath("//*[@id='isAgeSelected']");
        public static By divDisplayMessageAge = By.xpath("//*[@id='txtAge']");
        public static By buttonCheckUncheckAll = By.xpath("//input[@id='check1']") ;
        public static By inputMultipleCheckBox = By.xpath("//input[@class='cb1-element']");
    }

    public static class BasicSelectDropDown {
        public static By selectDayOfTheWeek = By.xpath("//select[@id='select-demo']");
        public static By paragraphDaySelected = By.xpath("//p[contains(text(),'Day')]");
    }

    public static class BasicRadioButton {
        public static By buttonGetCheckedValue = By.xpath("//*[@id='buttoncheck']");
        public static By paragraphRadioButton = By.xpath("//p[@class='radiobutton']");
        public static By getButtonGetValues = By.xpath("(//button[@class='btn btn-default'])[2]");
        public static By responseGetValues = By.xpath("//p[@class='groupradiobutton']");

        public static By inputByGender(String gender) {
            return By.xpath(
                    String.format("//input[@value='%s' and @name='optradio']", gender)
            );
        }

        public static By inputByAge(String age) {
            return By.xpath(
                    String.format("//input[@value='%s']", age)
            );
        }

        public static By inputByGenderGroup(String genderGroup) {
            return By.xpath(
                    String.format("//input[@value='%s' and @name='gender']", genderGroup)
            );
        }

        public static By inputByAgeGroup(String ageGroup) {
            return By.xpath(
                    String.format("//input[@value='%s' and @name='ageGroup']", ageGroup)
            );
        }
    }
}
