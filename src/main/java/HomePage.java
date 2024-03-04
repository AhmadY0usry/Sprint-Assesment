import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
   private WebDriver driver;

   public HomePage(WebDriver driver) {
      this.driver = driver;
   }

   By searchBar= By.id("search_input");
   By searchResultsClass= By.className("product-title");

   public void enterTextOnSearchBar(String Keyword)
   {
      driver.findElement(searchBar).sendKeys(Keyword+ Keys.ENTER);
   }

   public List <WebElement> returnProductsName()
   {

      return driver.findElements(searchResultsClass);


   }


}