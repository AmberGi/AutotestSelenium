package lt.gintare.seleniumeasy.pom.pages;

import java.util.List;

public class BasicCheckBoxPage {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
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

    public static void clickButtonCheckAll() {
        Common.clickElement(
                Locator.BasicCheckBox.buttonCheckAll
        );
    }

    public static boolean checkSelectedStatusOfAllCheckBoxes(boolean isCheckBoxStatus) {
        List<Boolean> statusListOfCheckedBoxes =
                Common.getSelectedStatusOfAllCheckedBoxes(
                        Locator.BasicCheckBox.inputMultipleCheckBox
                );

        for (boolean status : statusListOfCheckedBoxes) {
            if (status != isCheckBoxStatus) return false;
        }
        return true;
    }
}
