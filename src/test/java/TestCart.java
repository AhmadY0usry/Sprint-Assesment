import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends TestBase {

    CartPage cartPage;
    String productName;
    @Test
    public void VerifyingAddToCart() throws InterruptedException {

        cartPage = new CartPage(returnDriver());
        // 1- Click on product
        cartPage.clickOnProduct();
        // 2- Click on add to cart button
        cartPage.clickOnAddCart();
        // 3- get product name
        productName=cartPage.getGetProduct();
        // 4- Go to cart page
        cartPage.clickOnCartIcon();
        // 5- Click on check out
        cartPage.clickOnCheckOut();
        // 6- View the product
        Assert.assertEquals(cartPage.getProductName(),this.productName);



    }

}
