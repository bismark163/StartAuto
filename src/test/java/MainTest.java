import core.User;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
    public RemoteWebDriver driver;

    @BeforeTest
    public void start() {
        this.driver = new ChromeDriver();
    }

    @Test
    public void testA() {
        this.driver.get(
                User.getInstace().getUrl()
        );
    }

    @AfterClass
    public void finish() {
        this.driver.close();
        this.driver.quit();
    }
}
