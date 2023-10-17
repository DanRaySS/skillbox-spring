import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> listHobbies = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите логин: ");
        String login = in.nextLine();

        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Введите хобби через запятую: ");
        listHobbies.add(in.nextLine());
        in.close();
        String hobbies = listHobbies.get(0).replaceAll(",", "\n");

        Data data = new Data(name, login, age, hobbies);

        try {
            FileOutputStream fos = new FileOutputStream("main.danray");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(data);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("main.danray");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Data obj = (Data) ois.readObject();
            System.out.println(obj);

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}