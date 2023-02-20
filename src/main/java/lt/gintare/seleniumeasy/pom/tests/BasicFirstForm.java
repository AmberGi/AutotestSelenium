package lt.gintare.seleniumeasy.pom.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicFirstForm {

    WebDriver driver;

    @BeforeTest
    public void setUpDriver(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--start-maximized ");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    @Test
    public void testSingleInputField_InputMessageGintareInSeleniumEasy() {

        String message = "Gintarė";
        String expectedResult = "Gintarė";
        String actualResult;

        // WebElement inputMessage = driver.findElement(By.id("user-message"));
        // WebElement inputMessage02 = driver.findElement(By.className("form-control"));

        WebElement inputMessage = driver.findElement(By.xpath("//input[@id='user-message']"));
        inputMessage.sendKeys(message);
        WebElement showMessageButton = driver.findElement(
                //By.xpath("(//button[@class='btn btn-default'])[1]") su klase
                //By.xpath("//[text()='Show Message']") su tekstu
                //By.xpath("//button[@onclick='showInput();']") su onclick
                By.xpath("//form[@id='get-input']/button")
        );

        showMessageButton.click();

        System.out.println("onclick: " + showMessageButton.getAttribute("onclick"));
        System.out.println("class: " + showMessageButton.getAttribute("class"));

        WebElement spanDisplayMessage = driver.findElement(By.xpath("//span[@id='display']"));
        actualResult = spanDisplayMessage.getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoInputFieldsValueA_8ValueB_10InSeleniumEasy() {

        String valueA = "8";
        String valueB = "10";
        String expectedResult = "18";
        String actualResult;

        WebElement inputEnterA = driver.findElement(By.xpath("//*[@id='sum1']"));
        inputEnterA.sendKeys(valueA);

        WebElement inputEnterB = driver.findElement(By.xpath("//*[@id='sum2']"));
        inputEnterB.sendKeys(valueB);

        WebElement buttonGetTotal = driver.findElement(By.xpath("//*[@id='gettotal']/button"));
        buttonGetTotal.click();

        WebElement spanDisplayValue = driver.findElement(By.xpath("//*[@id='displayvalue']"));
        actualResult = spanDisplayValue.getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
