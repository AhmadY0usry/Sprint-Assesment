import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;
    private By product = By.linkText("Epson L1300 Eco Tank Printer");
    private By addCartButton = By.id("button_cart_3399");
    private By cartIcon = By.id("cart_status_4700");
    private By checkOutButton = By.cssSelector(".ty-btn.ty-btn__outline");
    private By productName = By.cssSelector(".ty-cart-content__product-title");
    private By getProduct = By.cssSelector("h1:nth-child(1) > bdi:nth-child(1)");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnProduct()
    {
        driver.findElement(this.product).click();
    }

    public void clickOnAddCart()
    {
        driver.findElement(this.addCartButton).click();
    }
    public void clickOnCartIcon() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        driver.findElement(this.cartIcon).click();
    }

    public void clickOnCheckOut(){
        driver.findElement(this.checkOutButton).click();
    }
    public String getProductName(){
        return driver.findElement(this.productName).getText();
    }

    public String getGetProduct() {
        return driver.findElement(this.getProduct).getText();
    }
}
