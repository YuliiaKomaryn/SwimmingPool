package persons;

final public class PersonalData {
    final public String name;
    final public String surname;

    public PersonalData(String name,
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
