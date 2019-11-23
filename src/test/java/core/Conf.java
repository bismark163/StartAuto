package core;
// плохой пример
public class Conf {
    public static Conf instance;
    private String url;

    public static Conf getInstance(Mode mode) {
        if (instance == null) {
            String url;
            if (mode == Mode.DEVEL) {
                url = "https://ya.ru";
            } else {
                url = "https://yandex.ru";
            }

            instance = new Conf(url);
        }

        return instance;
    }

    public static Conf getInstance() {
        return instance;
    }

    private Conf(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

}
