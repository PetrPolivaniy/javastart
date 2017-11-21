package program.model;

/**
 * Created by Admin on 19.11.2017.
 */
public class Client {
    private String name;
    private String surname;
    private int age;

    public Client (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
public String getName(){
    return name;
}
public String getSurname() {
    return surname;
}
public int getAge() {
    return age;
}
}
