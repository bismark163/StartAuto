package core;

import java.util.HashMap;

public class User {
    private static User instance;

    private String url;
    private String email;
    private String pass;
    private String waiting;



    private User(HashMap<String, String> data) {
        this.url = data.get("url");
        this.email = data.get("email");
        this.pass = data.get("pass");
        this.waiting = data.get("waiting");
    }

    public static User getInstace() {
        if (instance == null) {
            instance = new User(getUserData());
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

    public String getWaiting() {
        return this.waiting;
    }

    private static String getUserType() {
        String userType = System.getenv("userType");
        if (userType == null) {
            throw new IllegalArgumentException("Cannot detect user type. Current value is null.");
        }
        return userType;
    }

    private static boolean isSuper() { return getUserType().equals("super"); }

    private static boolean isUsual() { return getUserType().equals("usual"); }


    private static HashMap<String, String> getUserData() {
        if (isSuper()) {
            return SuperUser.data;
        } else if (isUsual()) {
            return UsualUSer.data;
        } else {
            throw new IllegalArgumentException("Cannot determine user type. You set unknown type " + getUserType());
        }
    }
}
