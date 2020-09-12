package clients_services;

import java.util.LinkedList;

import stuff.Locker;

public class CheckLocker {
    final static LinkedList<Locker>  lockers = new LinkedList<>();

    public void addLocker(Locker locker){
        lockers.add(locker);
    }

    public static void printLockers()
    {
        System.out.println("\tLockers: " );
        for (int i = 0; i < lockers.size(); i++)
            System.out.println("\t" + lockers.get(i));
    }

}
