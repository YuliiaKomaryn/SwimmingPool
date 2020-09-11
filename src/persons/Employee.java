package persons;

final public class Employee {
    final private PersonalData personalData;
    private double salary;
    private String post;

    public Employee(PersonalData personalData,
                    double salary,
                    String post) {
        this.personalData = personalData;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person='" + personalData + '\'' +
                '}';
    }
}

