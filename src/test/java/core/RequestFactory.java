package core;

public class RequestFactory {

    public static Request getVersion() {
        String version = System.getenv("version");
        return getApiVersion(version);
    }

    public static Request getVersion(String version) {
        return getApiVersion(version);
    }

    private static Request getApiVersion(String version) {
        if (version == null) {
            throw new IllegalArgumentException("Browser type is not set.");
        }

        if (version.equals("1")) {
            return new Request1();
        } else if (version.equals("2")){
            return new Request2();
        } else {
            throw new IllegalAccessError("Dont know this version" + version);
        }
    }
}
