package lt.gintare.seleniumeasy.pom.pages;

public class BasicFirstFormPage {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void enterMessage(String message) {
        Common.sendKeysToElement(
                Locator.BasicFirstForm.inputUserMessage,
                message
        );
    }

    public static void clickButtonShowMessage() {
        Common.clickElement(
                Locator.BasicFirstForm.buttonShowMessage
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locator.BasicFirstForm.spanDisplayMessage
        );
    }

    public static void enterValueA(String value) {
        Common.sendKeysToElement(
                Locator.BasicFirstForm.inputValueA,
                value
        );
    }

    public static void enterValueB(String value) {
        Common.sendKeysToElement(
                Locator.BasicFirstForm.inputValueB,
                value
        );
    }

    public static void clickButtonGetTotal() {
        Common.clickElement(
                Locator.BasicFirstForm.buttonGetTotal
        );
    }

    public static String readTotal() {
        return Common.getElementText(
                Locator.BasicFirstForm.spanDisplayTotal);
    }
}
