package lt.gintare.seleniumeasy.pom.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class BasicFirstForm {

        public static By inputUserMessage = By.xpath("//input[@id='user-message']");
        public static By buttonShowMessage = By.xpath("//button[@onclick='showInput();']");
        public static By spanDisplayMessage = By.xpath("//span[@id='display']");
        public static By inputValueA = By.xpath("//input[@id='sum1']");
        public static By inputValueB = By.xpath("//input[@id='sum2']");
        public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
        public static By spanDisplayTotal = By.xpath("//*[@id='displayvalue']");
    }

    public class BasicCheckBox {
        public static By checkBoxSingle = By.xpath("//*[@id='isAgeSelected']");
        public static By divDisplayMessageAge = By.xpath("//*[@id='txtAge']");
    }
}
