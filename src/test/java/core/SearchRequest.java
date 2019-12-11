package core;

public class SearchRequest extends Request {
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

    public SearchRequest addHeader (String header) {
        this.header = header;
        return this;
    }

    public SearchRequest addBody (String body) {
        this.body = body;
        return this;
    }

    public SearchRequest addUserAgent (String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public SearchRequest load() {
        SearchRequest SearchRequestObject = new SearchFactory().getVersion();
        return SearchRequestObject;
    }

}
