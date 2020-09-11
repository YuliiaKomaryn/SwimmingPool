package clients_services;

import java.util.LinkedList;
import java.util.Date;

import stuff.SwimmingStuff;

public class StuffRent {
    final private Date rentPeriod;
    final private double price;
    final private LinkedList<SwimmingStuff>  goods = new LinkedList<>();

    public StuffRent(Date rentPeriod,
                     double price) {
        this.price = price;
        this.rentPeriod = rentPeriod;
    }

    public void addStuffRent(SwimmingStuff swimmingStuff){
        goods.add(swimmingStuff);
    }
}
