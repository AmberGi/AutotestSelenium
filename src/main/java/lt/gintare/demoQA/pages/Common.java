package lt.gintare.demoQA.pages;

import lt.gintare.demoQA.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public static String getElementAttributeOutcome(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void acceptAlert() {
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void dismissAlert() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static boolean isAlertPresent() {
        try {
            Driver.getDriver().switchTo().alert();
        } catch (NoAlertPresentException e) {
            return false;
        }
        return true;
    }


    public static void clickElementByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = getElement(locator);
        actions.click(element);
        actions.perform();
    }

    public static void doubleClickElementByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(getElement(locator));
        actions.perform();
    }

    public static void rightClickElementByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator));
        actions.contextClick();
        actions.perform();
    }
}
