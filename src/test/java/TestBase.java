import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

    private WebDriver driver;
    HomePage homePage;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(@Optional("edge") String BName) {
        if (BName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (BName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        driver.get("https://egyptlaptop.com/");
        homePage = new HomePage(driver);
    }

    public WebDriver returnDriver()
    {
        return this.driver;
    }

}

