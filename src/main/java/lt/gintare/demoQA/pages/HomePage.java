package lt.gintare.demoQA.pages;

public class HomePage {

    public static void open() {
        Common.openUrl("https://demoqa.com/");
    }

    public static void clickMenuElements() {
        Common.clickElementByAction(
                Locator.Home.menuElements
        );
    }
}
