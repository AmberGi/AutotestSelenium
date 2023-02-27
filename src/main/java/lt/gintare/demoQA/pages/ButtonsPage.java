package lt.gintare.demoQA.pages;

public class ButtonsPage {

    public static void doubleClickOnButton() {
        Common.doubleClickElementByAction(Locator.Buttons.buttonDoubleClick);
    }

    public static String readMessageDoubleClick() {
        return Common.getElementText(Locator.Buttons.paragraphDoubleClick);
    }

    public static void rightClickOnButton() {
        Common.rightClickElementByAction(Locator.Buttons.buttonRightClick);
    }

    public static String readMessageRightClick() {
        return Common.getElementText(Locator.Buttons.paragraphRightClick);
    }
}
