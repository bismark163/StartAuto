package core;

public class AuthRequest1 extends AuthRequest {
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

    public AuthRequest1 addHeader(String header) {
        this.header = header;
        return this;
    }

    public AuthRequest1 addBody(String body) {
        this.body = body;
        return this;
    }

    public AuthRequest1 addUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

}
