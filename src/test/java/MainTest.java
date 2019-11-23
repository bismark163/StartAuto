import core.Conf;
import core.Config;
import core.Mode;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
    public RemoteWebDriver driver;

    @BeforeTest
    public void start() {
        this.driver.get(
                Conf.getInstance(Mode.DEVEL).getUrl()
        );

        this.driver = new ChromeDriver();
    }

    @Test
    public void testA() {
        this.driver.get(
                Config.getInstance().getUrl()
        );
    }

    @Test
    public void testB() {
        this.driver.get(
                Conf.getInstance().getUrl()
        );
    }

    @AfterClass
    public void finish() {
        this.driver.close();
        this.driver.quit();
    }

    protected void openMainUrl() {
        this.driver.get(
                Config.getInstance().getUrl()
        );
    }
}
