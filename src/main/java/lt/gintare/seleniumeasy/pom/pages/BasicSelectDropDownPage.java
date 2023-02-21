package lt.gintare.seleniumeasy.pom.pages;

public class BasicSelectDropDownPage {
    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html"
        );
    }

    public static void close() {
        Common.closeDriver(
        );
    }

    public static void selectDayFromDropDownList(String day) {
        Common.selectOptionByValue(
                Locator.BasicSelectDropDown.selectDayOfTheWeek,
                day
        );
    }

    public static String readMessageSelectedValue() {
        return Common.getElementText(
                Locator.BasicSelectDropDown.paragraphDaySelected
        );
    }
}

