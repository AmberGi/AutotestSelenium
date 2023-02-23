package lt.gintare.seleniumeasy.pom.pages;

import lt.gintare.seleniumeasy.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String day) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(day);
    }

    public static List<Boolean> getSelectedStatusOfAllCheckedBoxes(By locator) {
        List<WebElement> elements = getElements(locator);
        List<Boolean> elementsStatuses = new ArrayList<>();

        for (WebElement element : elements) {
            elementsStatuses.add(element.isSelected());
        }
        return elementsStatuses;
    }
}
