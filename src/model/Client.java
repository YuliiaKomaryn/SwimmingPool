package model;

public final class Client {
    private final String name;
    private final String surname;
    private final double temperature;

    public Client(String name,
                  String surname,
                  double temperature) {
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


