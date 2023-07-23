package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static By getField(String value) {
        return By.xpath("//input[@id='input-" + value + "']");
    }

    public static By getErrorMessage(String value) {
        return By.xpath("//*[text()='" + value + "']");
    }

    @Test
    public void myFirstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/raresuut/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://siit.epizy.com/");
        driver.findElement(By.xpath("//span[@class='caret']")).click();
        driver.findElement(By.xpath("//*[text()='Register']")).click();
        driver.findElement(getField("firstname")).sendKeys("Draghici");
        driver.findElement(getField("lastname")).sendKeys("Roberta-Veronica");
        driver.findElement(getField("email")).sendKeys("veronicadraghici07@gmail.com");
        driver.findElement(getField("telephone")).sendKeys("0742323593");
        driver.findElement(getField("password")).sendKeys("loveAutomation4ever");
        driver.findElement(By.xpath("//label[@class='radio-inline']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(getErrorMessage(" Warning: You must agree to the Privacy Policy!")).isDisplayed();
        driver.findElement(getErrorMessage("Password confirmation does not match password!")).isDisplayed();
    }
}
