package main;

import service.*;

import java.time.LocalDate;
import java.util.Date;

public final class MainService {
    private final ClientWorkerService clientWorkerService = new ClientWorkerService();
    private final FixLockerService fixLockerService = new FixLockerService();
    private final PurchaseService purchaseService = new PurchaseService();
    private final TrainingService trainingService = new TrainingService();
    private final StuffRentService stuffRentService = new StuffRentService();

    public void addSwimmingPool(String name,
                                int depth,
                                int width,
                                int length,
                                String adress) {
        trainingService.addSwimmingPool(name, depth, width, length, adress);
        System.out.println(trainingService.toString());
    }

    public void addEmployee(String name,
                            String surname,
                            double salary,
                            String post) {
        clientWorkerService.addEmployee(name, surname, salary, post);
        System.out.println("\tДодавання працівника: " + name + " " + surname + " - " + post);
    }

    public void addClient(String name,
                            String surname,
                            double temperature) {
        clientWorkerService.addClient(name, surname, temperature);
        System.out.println("\tДодавання клієнта: " + name + " " + surname);
    }

    public void addPass(String type,
                        int price,
                        LocalDate expireDate) {
        purchaseService.addPass(type, price, expireDate);
        System.out.println("\t Додавання абонементу: тип - " + type +
                "; ціна - " + price + "; придатний до - " + expireDate);
    }

    public void addSwimmingStuff(String type,
                                 int price) {
        stuffRentService.addSwimmingStuff(type, price);
        System.out.println("\t Додавання спорядження для оренди: тип - "
                + type + "; ціна - " + price);
    }

    public void addLocker(int number,
                          boolean serviceability) {
        fixLockerService.addLocker(number, serviceability);
        System.out.println("\t Додавання шафки : номер - "
                + number + "; справність - " + serviceability);
    }
}
