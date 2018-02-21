package pl.tiwaszko.client;

/**
 * Created by tomasziwaszko on 21.02.2018.
 */
public class Client {
    private final int age;
    private final String name;

    public Client(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
