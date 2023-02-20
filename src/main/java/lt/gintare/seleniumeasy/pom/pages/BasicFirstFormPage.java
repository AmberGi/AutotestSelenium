package lt.gintare.seleniumeasy.pom.pages;

import org.openqa.selenium.By;

public class BasicFirstFormPage {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void close() {
        Common.closeDriver();
    }

    public static void enterMessage(String message) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='user-message']"),
                message
        );
    }

    public static void clickButtonShowMessage() {
        Common.clickElement(By.xpath("//button[@onclick='showInput();']")
        );
    }

    public static String readMessage() {
        return Common.getElementText(By.xpath("//span[@id='display']")
        );
    }

    public static void enterValueA(String value) {
        Common.sendKeysToElement(By.xpath("//input[@id='sum1']"),
                value
        );
    }

    public static void enterValueB(String value) {
        Common.sendKeysToElement(By.xpath("//input[@id='sum2']"),
                value
        );
    }

    public static void clickButtonGetTotal() {
        Common.clickElement(By.xpath("//*[@id='gettotal']//button"));
    }

    public static String readTotal() {
        return Common.getElementText(By.xpath("//*[@id='displayvalue']"));
    }
}
