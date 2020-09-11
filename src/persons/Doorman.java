package persons;

final public class Doorman {
    final private PersonalData personalData;

    Doorman(PersonalData personalData){
        this.personalData = personalData;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "person='" + personalData + '\'' +
                '}';
    }
}

