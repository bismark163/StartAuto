package core;

public class RegistrationRequest1 extends RegistrationRequest {
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

    public RegistrationRequest1 addHeader (String header) {
        this.header = header;
        return this;
    }

    public RegistrationRequest1 addBody (String body) {
        this.body = body;
        return this;
    }

    public RegistrationRequest1 addUserAgent (String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public RegistrationRequest1 load() {
        return new RegistrationRequest1();
    }


}
