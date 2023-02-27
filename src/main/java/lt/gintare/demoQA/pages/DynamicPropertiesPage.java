package lt.gintare.demoQA.pages;

public class DynamicPropertiesPage {

    public static void open(){
        Common.openUrl("https://demoqa.com/dynamic-properties");
    }

    public static void clickButtonVisibleAfter() {
        Common.waitForElementToBeVisible(Locator.DynamicProperties.buttonVisibleAfter);
        Common.clickElement(Locator.DynamicProperties.buttonVisibleAfter);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }
}
