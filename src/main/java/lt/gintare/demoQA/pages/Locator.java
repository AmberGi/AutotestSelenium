package lt.gintare.demoQA.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class Home {
        public static By menuElements = By.xpath("(//div[@class='card mt-4 top-card'])[1]");

    }

    public static class Elements {

        public static By menuButtons = By.xpath
                ("//div[@class='element-list collapse show']//li[@id='item-4']");
    }

    public static class Buttons {
        public static By buttonDoubleClick = By.xpath("//button[@id='doubleClickBtn']");
        public static By paragraphDoubleClick = By.xpath("//*[@id='doubleClickMessage']");
        public static By buttonRightClick = By.xpath("//*[@id='rightClickBtn']");
        public static By paragraphRightClick = By.xpath("//*[@id='rightClickMessage']");
    }

    public class DynamicProperties {
        public static By buttonVisibleAfter = By.xpath("//button[@id='visibleAfter']");
    }
}
