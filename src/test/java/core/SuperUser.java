package core;

import java.util.HashMap;

public class SuperUser {
    public static final HashMap<String, String> data = new HashMap<String, String>() {{
        put("url", "https://google.com");
        put("email", "superluser@ya.ru");
        put("pass", "usualpass");
        put("waiting", "overlay");
    }};
}
