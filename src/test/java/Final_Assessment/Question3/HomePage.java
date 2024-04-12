package Final_Assessment.Question3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(By.name("q")).sendKeys(productName);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
