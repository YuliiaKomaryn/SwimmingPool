package clients_services;

import java.util.LinkedList;

import stuff.Locker;

public class CheckLocker {
    final private LinkedList<Locker>  lockers = new LinkedList<>();

    public void addLocker(Locker locker){
        lockers.add(locker);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nLockers: ");
        for(Locker c: lockers){
            stringBuilder.append("\nnumber: ")
                    .append(c.getNumber())
                    .append("\t Serviceability: ")
                    .append(c.getServiceability());
        }

        return stringBuilder.toString();
    }
}
