package clients_services;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

import persons.Client;
import persons.Employee;
import stuff.Locker;

import java.util.LinkedList;

public class ClientWorkerService {
    private final LinkedList<Employee>  employees = new LinkedList<>();
    private final LinkedList<Client>    clients = new LinkedList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Employees: ");
        for(Employee c: employees){
            stringBuilder.append("\n\tPost: ")
                    .append(c.getPost())
                    .append("\t PersonalData: ")
                    .append(c.getPersonalData());
        }
        return stringBuilder.toString();
    }

}


