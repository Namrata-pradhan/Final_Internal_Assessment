package Final_Assessment.Question3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//span[text()='Login']")).click();
    }
}
