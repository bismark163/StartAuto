package core;

public class SearchRequest1 extends SearchRequest {
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

    public SearchRequest1 addHeader (String header) {
        this.header = header;
        return this;
    }

    public SearchRequest1 addBody (String body) {
        this.body = body;
        return this;
    }

    public SearchRequest1 addUserAgent (String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public SearchRequest1 load() {
        return new SearchRequest1();
    }


}
