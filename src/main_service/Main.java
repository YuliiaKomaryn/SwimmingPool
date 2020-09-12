package main_service;

import java.util.ArrayList;
import java.util.Arrays;

import clients_services.ClientWorkerService;
import clients_services.StuffRent;
import persons.*;
import stuff.*;


public class Main {
    public static void main(String[] args) {

        System.out.println(
                "\t Якщо уявити, що ми моделюємо нашу реальність \n" +
                    "\t (певна, близька мені, дефініція життя, власне, і є моделюванням реільності), \n" +
                    "\t то почати ту розбудову обов'язково треба з басейну. \n\n" +
                    "\t Створюємо басейн: ");

        SwimmingPool sp1 = new SwimmingPool("Басейн СК КПІ", 10, 25, 50, "вул. Польова, 38.1");
        System.out.println(sp1.toString());

        System.out.println(
                "\n\t Додаємо басейну працівників: ");

        Employee admin = new Employee("Іван", "Іванов", 10000, "Адміністратор");
        Employee doorman = new Employee("Віра", "Петрівна", 5000, "Вахтер");
        Employee nurse = new Employee("Тетяна", "Решетняк", 7000, "Медсестра");
        Employee coach = new Employee("Джейсон", "Стетхем", 15000, "Тренер");

        ClientWorkerService clientWorkerService1 = new ClientWorkerService();

        clientWorkerService1.addEmployee(admin);
        clientWorkerService1.addEmployee(doorman);
        clientWorkerService1.addEmployee(nurse);
        clientWorkerService1.addEmployee(coach);

        ClientWorkerService.printEmloyees();

        System.out.println(
                "\n\t Оскільки це бізнес, то нам потрібно визначитись з джерелами прибутків.\n" +
                        "\t Першими двома будуть продаж абонементів та оренда спорядження. \n\n " +
                        "\t Додаємо різновиди абонементів:"
        );

        // Додати абонементи

        System.out.println(
                "\n\t Додаємо спорядження для оренди:"
        );

        SwimmingStuff ss1 = new SwimmingStuff("Шапочка для плавання", 10);
        SwimmingStuff ss2 = new SwimmingStuff("Окуляри для плавання", 20);
        SwimmingStuff ss3 = new SwimmingStuff("Маска для дайвінгу", 30);
        SwimmingStuff ss4 = new SwimmingStuff("Ласти", 40);
        SwimmingStuff ss5 = new SwimmingStuff("Трубка", 20);

        ArrayList<SwimmingStuff> stuffForRent = new ArrayList<>(Arrays.asList(ss1, ss2, ss3, ss4, ss5));

        System.out.println(stuffForRent.toString());

        System.out.println(
                "\n\t Важливим моментом у створенні довіри до бізнесу є безпека та приватність клієнта. \n" +
                        "\n\t Це саме час додати шафки-локери для особистих речей:"
        );

        Locker locker1 = new Locker(1, Boolean.TRUE);
        Locker locker2 = new Locker(2, Boolean.FALSE);
        Locker locker3 = new Locker(3, Boolean.TRUE);
        Locker locker4 = new Locker(4, Boolean.FALSE);
        Locker locker5 = new Locker(5, Boolean.TRUE);

        ArrayList<Locker> lockersToChoose = new ArrayList<>(Arrays.asList(locker1, locker2, locker3, locker4, locker5));

        Client client1 = new Client("Єва", "Лонгорія", 36.6);

        ClientWorkerService clientWorkerService2 = new ClientWorkerService();

        clientWorkerService2.addClient(client1);

    }
}
