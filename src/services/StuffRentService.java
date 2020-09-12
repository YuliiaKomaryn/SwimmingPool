package services;

import java.util.LinkedList;

import stuff.SwimmingStuff;

final public class StuffRentService {
    final private String rentPeriod;
    final private LinkedList<SwimmingStuff>  goods = new LinkedList<>();

    public StuffRentService(String rentPeriod) {
        this.rentPeriod = rentPeriod;
    }

    public void addStuffRent(SwimmingStuff swimmingStuff){
        goods.add(swimmingStuff);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Stuff for rent: ");
        for(SwimmingStuff c: goods){
            stringBuilder.append("\n\tType: ")
                    .append(c.getType())
                    .append("\t Price: ")
                    .append(c.getPrice());
        }
        return stringBuilder.toString();
    }

}
