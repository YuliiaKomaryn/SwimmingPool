package clients_services;

import stuff.Locker;

import java.util.LinkedList;

import stuff.SwimmingPool;
import stuff.SwimmingStuff;

public class TrainingService {
    final private LinkedList<SwimmingPool> swimmingPools = new LinkedList<>();

    public void addSwimmingPool(SwimmingPool swimmingPool){
        swimmingPools.add(swimmingPool);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Swimming Pool info: ");
        for(SwimmingPool c: swimmingPools){
            stringBuilder.append("\n\tName: ")
                    .append(c.getName())
                    .append("\t Adress: ")
                    .append(c.getAdress())
                    .append("\n\tDepth: ")
                    .append(c.getDepth())
                    .append("\tWidth: ")
                    .append(c.getWidth())
                    .append("\tLength: ")
                    .append(c.getLength());
        }
        return stringBuilder.toString();
    }

}
