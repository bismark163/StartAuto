package core;

public class AuthRequest extends Request {
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

    public AuthRequest addHeader(String header) {
        this.header = header;
        return this;
    }

    public AuthRequest addBody(String body) {
        this.body = body;
        return this;
    }

    public AuthRequest addUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public AuthRequest load() {
        AuthRequest AuthRequestObject = new AuthRequestFactory().getVersion();
        return AuthRequestObject;
    }


}
