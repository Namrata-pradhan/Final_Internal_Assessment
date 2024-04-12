package Final_Assessment.Question3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void userLoginTest() {
        driver.get("https://www.flipkart.com/");
        loginPage.login("namrata4122002@gmail.com", "Namrata@2002");
        Assert.assertTrue(driver.getTitle().contains("Online Shopping"));
    }

    @Test(priority = 2)
    public void addProductToCartTest() {
        homePage.searchProduct("Laptop");
        Assert.assertTrue(driver.getTitle().contains("Search Results"));
    }

    @Test(priority = 3)
    public void checkoutAndPaymentTest() {
        cartPage.proceedToCheckout();
        Assert.assertTrue(checkoutPage.isPaymentPageDisplayed());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
