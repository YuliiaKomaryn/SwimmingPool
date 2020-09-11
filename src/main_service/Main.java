package main_service;

import java.util.Calendar;
import java.util.Date;

import persons.*;
import stuff.*;
import clients_services.*;
import activities.*;


public class Main {
    public static void main(String[] args) {

        SwimmingPool sp1 = new SwimmingPool("Басейн СК КПІ", 10, 25, 50);

        SwimmingStuff ss1 = new SwimmingStuff("pool cap");
        SwimmingStuff ss2 = new SwimmingStuff("pool watches");
        SwimmingStuff ss3 = new SwimmingStuff("diving mask");
        SwimmingStuff ss4 = new SwimmingStuff("fins");
        SwimmingStuff ss5 = new SwimmingStuff("snorkel");

        Locker locker1 = new Locker(1, Boolean.TRUE);
        Locker locker2 = new Locker(2, Boolean.FALSE);
        Locker locker3 = new Locker(3, Boolean.TRUE);
        Locker locker4 = new Locker(4, Boolean.FALSE);
        Locker locker5 = new Locker(5, Boolean.TRUE);

        Employee admin = new Employee("Іван", "Іванов", 10000, "Адміністратор");
        Employee doorman = new Employee("Віра", "Петрівна", 5000, "Вахтер");
        Employee nurse = new Employee("Тетяна", "Решетняк", 7000, "Медсестра");
        Employee coach = new Employee("Джейсон", "Стетхем", 15000, "Тренер");

        Client client1 = new Client("Єва", "Лонгорія");


        System.out.println(
                "Історія одного басейну \n"
        );


    }
}
