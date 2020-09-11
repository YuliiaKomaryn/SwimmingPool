package main_service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import persons.*;
import stuff.*;
import clients_services.*;
import activities.*;


public class Main {
    public static void main(String[] args) {

        SwimmingPool sp1 = new SwimmingPool("Басейн СК КПІ", 10, 25, 50);

        SwimmingStuff ss1 = new SwimmingStuff("Шапочка для плавання");
        SwimmingStuff ss2 = new SwimmingStuff("Окуляри для плавання");
        SwimmingStuff ss3 = new SwimmingStuff("Маска для дайвінгу");
        SwimmingStuff ss4 = new SwimmingStuff("Ласти");
        SwimmingStuff ss5 = new SwimmingStuff("Трубка");

        ArrayList<SwimmingStuff> stuffForRent = new ArrayList<>(Arrays.asList(ss1, ss2, ss3, ss4, ss5));

        Locker locker1 = new Locker(1, Boolean.TRUE);
        Locker locker2 = new Locker(2, Boolean.FALSE);
        Locker locker3 = new Locker(3, Boolean.TRUE);
        Locker locker4 = new Locker(4, Boolean.FALSE);
        Locker locker5 = new Locker(5, Boolean.TRUE);

        ArrayList<Locker> lockersToChoose = new ArrayList<>(Arrays.asList(locker1, locker2, locker3, locker4, locker5));


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
