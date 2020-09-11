package persons;

final public class Client {
    final private String name;
    final private String surname;
    final private double temperature;

    public Client(String name,
                  String surname,
                  double temperature){
        this.name = name;
        this.surname = surname;
        this.temperature = temperature;
    }

    public String getPersonalData() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


