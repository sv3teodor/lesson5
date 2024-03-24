import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static configs.TestConfig.*;

public abstract class BaseTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void initTest() {
        WebDriverManager.chromedriver().driverVersion(CHRONIUM_DRIVER_VER).setup();
        System.setProperty("webdriver.chrome.driver", CHRONIUM_DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }

    @BeforeEach
    public void prepare() {
        driver.get(HOME_PAGE_URL);
    }
}
