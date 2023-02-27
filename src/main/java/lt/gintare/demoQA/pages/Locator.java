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
}
