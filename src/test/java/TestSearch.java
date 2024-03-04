import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends TestBase {

    String Keyword = "HDMI";

    @Test
    public void verifySearchResults() {
        // 1- enter search keyword
        homePage.enterTextOnSearchBar(Keyword);

        // 2-Return results in a list
        List<WebElement> allResults = homePage.returnProductsName();
        // 3- Verify that all result contain hdmi text in it's title
        for (WebElement result : allResults) {
            String resultText = result.getText().toLowerCase();
            Assert.assertTrue(resultText.contains(Keyword.toLowerCase()));
        }
    }

}

