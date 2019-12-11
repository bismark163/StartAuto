package core;

public class SearchRequest2 extends SearchRequest {
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

    public SearchRequest2 addHeader (String header) {
        this.header = header;
        return this;
    }

    public SearchRequest2 addBody (String body) {
        this.body = body;
        return this;
    }

    public SearchRequest2 addUserAgent (String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public SearchRequest2 load() {
        return new SearchRequest2();
    }


}
