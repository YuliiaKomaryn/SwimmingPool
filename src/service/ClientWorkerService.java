package service;

import java.util.LinkedList;

import model.Client;
import model.Employee;

public final class ClientWorkerService {
    private final LinkedList<Employee> employees = new LinkedList<>();
    private final LinkedList<Client> clients = new LinkedList<>();

    public Employee addEmployee(String name,
                                String surname,
                                double salary,
                                String post) {

        Employee tempEmployee = new Employee(name, surname, salary, post);
        employees.add(tempEmployee);

        return tempEmployee;
    }

    public Client addClient(String name,
                            String surname,
                            double temperature) {

        Client tempClient = new Client(name, surname, temperature);
        clients.add(tempClient);

        return tempClient;
    }

}


