package core;


public class Request {

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

    public Request addHeader(String header) {
        this.header = header;
        return this;
    }

    public Request addBody(String body) {
        this.body = body;
        return this;
    }

    public Request addUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public Request load() {
        Request RequestObject = new RequestFactory().getVersion();
        return RequestObject;
    }

}
