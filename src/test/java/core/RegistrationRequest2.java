package core;

public class RegistrationRequest2 extends Request2 {
    private String header;
    private String userAgent;
    private String body;

    public String getHeader() {
        return header;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getBody() {
        return body;
    }

    public RegistrationRequest2 addHeader (String header) {
        this.header = header;
        return this;
    }

    public RegistrationRequest2 addBody (String body) {
        this.body = body;
        return this;
    }

    public RegistrationRequest2 addUserAgent (String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public Request2 load() {
        return new RegistrationRequest2();
    }


}
