package persons;

final public class Admin {
    final private PersonalData personalData;

    public Admin(PersonalData personalData){
        this.personalData = personalData;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "person='" + personalData + '\'' +
                '}';
    }
}

