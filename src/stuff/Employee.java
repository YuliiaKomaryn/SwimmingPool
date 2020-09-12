package stuff;

final public class Employee {
    final private String name;
    final private String surname;
    final private double salary;
    private String post;

    public Employee(String name,
                    String surname,
                    double salary,
                    String post) {
        this.salary = salary;
        this.name = name;
        this.surname = surname;
        this.post = post;
    }


    public String getPersonalData() {
        return name + " " + surname;
    }

    public String getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person='" + name +
                ", surname='" + surname +
                ", post=" + post +
                '}';
    }
}

