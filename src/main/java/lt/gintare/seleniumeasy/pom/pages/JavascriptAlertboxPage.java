package lt.gintare.seleniumeasy.pom.pages;

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
}
