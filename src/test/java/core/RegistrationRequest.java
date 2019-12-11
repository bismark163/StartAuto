package core;

public class RegistrationRequest extends Request {
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

    public RegistrationRequest addHeader (String header) {
        this.header = header;
        return this;
    }

    public RegistrationRequest addBody (String body) {
        this.body = body;
        return this;
    }

    public RegistrationRequest addUserAgent (String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public RegistrationRequest load() {
        RegistrationRequest RegistrationRequestObject = new RegistrationRequestFactory().getVersion();
        return RegistrationRequestObject;
    }


}
