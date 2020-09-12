package clients_services;

import java.util.LinkedList;
import java.util.Date;

import stuff.SwimmingStuff;

public class StuffRent {
    final private String rentPeriod;
    final static LinkedList<SwimmingStuff>  goods = new LinkedList<>();

    public StuffRent(String rentPeriod) {
        this.rentPeriod = rentPeriod;
    }

    public void addStuffRent(SwimmingStuff swimmingStuff){
        goods.add(swimmingStuff);
    }

    public static void printStuff()
    {
        System.out.println("\tStuff: " );
        for (int i = 0; i < goods.size(); i++)
            System.out.println("\t" + goods.get(i));
    }
}
