package main;

import java.time.LocalDate;
import java.util.LinkedList;

import main.MainService;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                "\t Якщо уявити, що ми моделюємо нашу реальність \n" +
                        "\t (певна, близька мені, дефініція життя, власне, і є моделюванням реальності), \n" +
                        "\t то почати ту розбудову обов'язково треба з басейну. \n\n" +
                        "\t Створюємо сервіс керування басейном.");

        MainService mainService = new MainService();

        System.out.println("\n\t Додаємо безпосередньо басейн: ");

        mainService.addSwimmingPool("Басейн СК КПІ", 10, 25, 50, "вул. Польова, 38/1");

        System.out.println("\n\t Додаємо басейну працівників: ");

        mainService.addEmployee("Іван", "Іванов", 10000, "Адміністратор");
        mainService.addEmployee("Віра", "Петрівна", 5000, "Вахтер");
        mainService.addEmployee("Тетяна", "Решетняк", 7000, "Медсестра");
        mainService.addEmployee("Джейсон", "Стетхем", 15000, "Тренер");

        System.out.println(
                "\n\t Оскільки це бізнес, то нам потрібно визначитись з джерелами прибутків.\n" +
                        "\t Першими двома будуть продаж абонементів та оренда спорядження. \n\n " +
                        "\t Додаємо різновиди абонементів:"
        );

        mainService.addPass("1 time", 50, LocalDate.now());
        mainService.addPass("month", 200, LocalDate.now().plusMonths(1));
        mainService.addPass("year", 2000, LocalDate.now().plusYears(1));

        System.out.println(
                "\n\t Додаємо спорядження для оренди:"
        );

        mainService.addSwimmingStuff("Шапочка для плавання", 10);
        mainService.addSwimmingStuff("Окуляри для плавання", 20);
        mainService.addSwimmingStuff("Маска для дайвінгу", 30);
        mainService.addSwimmingStuff("Ласти", 40);
        mainService.addSwimmingStuff("Трубка", 20);

        System.out.println(
                "\n\t Важливим моментом у створенні довіри до бізнесу є безпека та приватність клієнта. \n" +
                        "\t Це саме час додати шафки-локери для особистих речей:"
        );

        mainService.addLocker(1, Boolean.TRUE);
        mainService.addLocker(2, Boolean.FALSE);
        mainService.addLocker(3, Boolean.TRUE);

        System.out.println(
                "\n\t Басейн готовий зустрічати першого клієнта. " +
                        "\n\t А ось і він: "
        );

        mainService.addClient("Єва", "Лонгорія", 36.6);

    }
}
