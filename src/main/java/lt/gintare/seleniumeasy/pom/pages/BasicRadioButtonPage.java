package lt.gintare.seleniumeasy.pom.pages;

public class BasicRadioButtonPage {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public static void clickRadioButtonGender(String gender) {
        Common.clickElement(Locator.BasicRadioButton.inputByGender(gender));
    }

    public static void clickButtonGetCheckedValue() {
        Common.clickElement(Locator.BasicRadioButton.buttonGetCheckedValue);
    }

    public static String getSingleResponseMessage() {
        return Common.getElementText(Locator.BasicRadioButton.paragraphRadioButton);
    }

    public static void clickGroupRadioButtonGenderGroup(String genderGroup) {
        Common.clickElement(Locator.BasicRadioButton.inputByGenderGroup(genderGroup));
    }

    public static void clickGroupRadioButtonAgeGroup(String ageGroup) {
        Common.clickElement(Locator.BasicRadioButton.inputByAgeGroup(ageGroup));
    }

    public static void clickGroupRadioButtonGetValues() {
        Common.clickElement(Locator.BasicRadioButton.getButtonGetValues);
    }

    public static String getValuesResposeMessage() {
        return Common.getElementText(Locator.BasicRadioButton.responseGetValues);
    }
}

