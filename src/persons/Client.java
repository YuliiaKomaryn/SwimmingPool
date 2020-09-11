package persons;

final public class Client {
    final private PersonalData personalData;

    Client(PersonalData personalData){
        this.personalData = personalData;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "person='" + personalData + '\'' +
                '}';
    }
}

