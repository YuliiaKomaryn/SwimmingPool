package clients_services;

import java.util.LinkedList;

import persons.Client;
import persons.Employee;

import java.util.LinkedList;

public class ClientWorkerService {
    final private LinkedList<Employee>  employees = new LinkedList<>();
    final private LinkedList<Client>    clients = new LinkedList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addClient(Client client){
        clients.add(client);
    }

    /*@Override
    public String toString() {
        return "ClientWorkerService{" +
                "employees=" + employees +
                ", clients='" + clients +
                '}';
    }*/
}
