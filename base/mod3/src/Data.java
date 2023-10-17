import java.io.Serializable;

public class Data implements Serializable {

    public static String name;
    public static String login;
    public static int age;
    public static String hobbies;

    public Data(String name, String login, int age, String hobbies) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String toString() {
        return "Пользователь: " + name
                + " с логином: " + login
                + ". Его возраст: " + age
                + ". Все хобби: \n" + hobbies;
    }
}
