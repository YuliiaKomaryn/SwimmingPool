package clients_services;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

import persons.Client;
import persons.Employee;

import java.util.LinkedList;

public class ClientWorkerService {
    private static LinkedList<Employee>  employees = new LinkedList<>();
    private static LinkedList<Client>    clients = new LinkedList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public static void printEmloyees()
    {
        System.out.println("\tEmployees: " );
        for (int i = 0; i < employees.size(); i++)
            System.out.println("\t" + employees.get(i));
    }


}
    /*@Override
    public String toString() {
        return "ClientWorkerService{" +
                "employees=" + employees +
                ", clients='" + clients +
                '}';
    }*/

