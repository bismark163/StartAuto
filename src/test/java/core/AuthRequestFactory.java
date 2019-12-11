package core;

public class AuthRequestFactory {

    public AuthRequest getVersion() {
        String version = System.getenv("version");
        return getApiVersion(version);
    }

    public static AuthRequest getVersion(String version) {
        return getApiVersion(version);
    }

    private static AuthRequest getApiVersion(String version) {
        if (version == null) {
            throw new IllegalArgumentException("Api version is not set.");
        }

        if (version.equals("1")) {
            return new AuthRequest1();
        } else if (version.equals("2")) {
            return new AuthRequest2();
        } else {
            throw new IllegalAccessError("Dont know this version" + version);
        }
    }
}
