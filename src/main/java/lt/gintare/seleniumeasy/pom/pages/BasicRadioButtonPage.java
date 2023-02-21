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
}
