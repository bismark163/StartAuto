package core;

import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testA() {
        Request regReq = new AuthRequest()
                .addBody("wdwd")
                .addHeader("HEADER FROM TEST")
                .addUserAgent("dwdw")
                .load();

        System.out.println(regReq.getBody());
    }

    @Test
    public void testB() {
        Request regReq = new RegistrationRequest()
                .addBody("qwfffff")
                .addHeader("Hbbbbbbb")
                .addUserAgent("zzzzzzzzzzzzz")
                .load();

        System.out.println(regReq.getBody());
    }

}


