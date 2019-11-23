package core;
// хороший пример
import java.util.HashMap;

public class Config {
    private static Config instance;

    private String url;
    private String email;
    private String pass;

    private Config(HashMap<String, String> data) {
        this.url = data.get("url");
        this.email = data.get("email");
        this.pass = data.get("pass");
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config(getData());
        }

        return instance;
    }

    public String getUrl() {
        return this.url;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPass() {
        return this.pass;
    }

    private static String getPlatform() {
        String platform = System.getenv("platform");
        if (platform == null) {
            throw new IllegalArgumentException("Cannot detect platform. Current value is null.");
        }

        return platform;
    }

    private static boolean isDevel() {
        return getPlatform().equals("devel");
    }

    private static boolean isProduction() {
        return getPlatform().equals("prod");
    }

    private static HashMap<String, String> getData() {
        if (isDevel()) {
            return DevelData.data;
        } else if (isProduction()) {
            return ProductionData.data;
        }

        throw new IllegalArgumentException("Cannot get data for platform. Current value of platform is " + getPlatform());
    }
}


