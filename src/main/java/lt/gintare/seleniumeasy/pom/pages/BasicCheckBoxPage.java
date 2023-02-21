package lt.gintare.seleniumeasy.pom.pages;

import org.openqa.selenium.By;

public class BasicCheckBoxPage {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public static void close() {
        Common.closeDriver();
    }

    public static void clickSingleCheckBox() {
        Common.clickElement(By.xpath("//*[@id='isAgeSelected']"));
    }

    public static String readMessage() {
        return Common.getElementText(By.xpath("//*[@id='txtAge']"));
    }
}
