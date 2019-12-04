package core;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testA() {
        Request regReq = new AuthRequest()
                .addBody("wdwd")
                .addHeader("wdwd")
                .addUserAgent("dwdw")
                .load();
    }

}


