package persons;

final public class Nurse {
    final private PersonalData personalData;
    private double qualification;

    Nurse(PersonalData personalData){
        this.personalData = personalData;
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "person='" + personalData + '\'' +
                '}';
    }
}

