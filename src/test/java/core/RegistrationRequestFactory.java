package core;

public class RegistrationRequestFactory {

    public RegistrationRequest getVersion() {
        String version = System.getenv("version");
        return getApiVersion(version);
    }

    public static RegistrationRequest getVersion(String version) {
        return getApiVersion(version);
    }

    private static RegistrationRequest getApiVersion(String version) {
        if (version == null) {
            throw new IllegalArgumentException("Api version is not set.");
        }

        if (version.equals("1")) {
            return new RegistrationRequest1();
        } else if (version.equals("2")) {
            return new RegistrationRequest2();
        } else {
            throw new IllegalAccessError("Dont know this version" + version);
        }
    }
}
