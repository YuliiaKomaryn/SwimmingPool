package persons;

final public class Client {
    final private String name;
    final private String surname;

    public Client(String name,
                  String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


