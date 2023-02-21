package lt.gintare.seleniumeasy.pom.pages;

public class BasicCheckBoxPage {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public static void close() {
        Common.closeDriver();
    }

    public static void clickSingleCheckBox() {
        Common.clickElement(
                Locator.BasicCheckBox.checkBoxSingle
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locator.BasicCheckBox.divDisplayMessageAge
        );
    }
}
