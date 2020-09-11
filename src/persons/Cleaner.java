package persons;

final public class Cleaner {
    final private PersonalData personalData;

    Cleaner(PersonalData personalData){
        this.personalData = personalData;
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "person='" + personalData + '\'' +
                '}';
    }
}

