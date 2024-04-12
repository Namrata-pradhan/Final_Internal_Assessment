package Final_Assessment.Question3;

import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private final WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPaymentPageDisplayed() {
        return driver.getTitle().contains("Payment Options");
    }
}