package lt.gintare.seleniumeasy.pom.pages;

import lt.gintare.seleniumeasy.pom.tests.common.Buttons;

public class JavascriptAlertboxPage {
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    public static void clickButtonMyAlert() {
        Common.clickElement(Locator.JavascriptAlertBox.buttonMyAlert);
    }

    public static void clickOkOnAlertBox() {
        Common.acceptAlert();
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static boolean isAlertBoxIsPresent() {
        return Common.isAlertPresent();
    }

    public static void clickOnConfirmBox(Buttons clickButton) {
        switch (clickButton) {
            case OK -> Common.acceptAlert();
            case CANCEL -> Common.dismissAlert();
        }
    }

    public static void clickButtonMyConfirm() {
        Common.clickElement(Locator.JavascriptAlertBox.buttonMyConfirm);
    }

    public static String readMessageMyConfirm() {
        return Common.getElementText(Locator.JavascriptAlertBox.paragraphMyConfirm);
    }
}
