package core;

public class SearchFactory {

    public SearchRequest getVersion() {
        String version = System.getenv("version");
        return getApiVersion(version);
    }

    public static SearchRequest getVersion(String version) {
        return getApiVersion(version);
    }

    private static SearchRequest getApiVersion(String version) {
        if (version == null) {
            throw new IllegalArgumentException("Api version is not set.");
        }

        if (version.equals("1")) {
            return new SearchRequest1();
        } else if (version.equals("2")) {
            return new SearchRequest2();
        } else {
            throw new IllegalAccessError("Dont know this version" + version);
        }
    }
}
