package persons;

final public class Coach {
    final private PersonalData personalData;
    private double salary;
    private double experience;

    Coach(PersonalData personalData){
          //sport
        this.personalData = personalData;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "person='" + personalData + '\'' +
                '}';
    }
}
