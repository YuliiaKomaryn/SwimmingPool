package services;

import java.util.LinkedList;

import stuff.Locker;

final public class FixLockerService {
    final private LinkedList<Locker>  lockers = new LinkedList<>();

    public void addLocker(Locker locker){
        lockers.add(locker);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\tLockers: ");
        for(Locker c: lockers){
            stringBuilder.append("\n\tnumber: ")
                    .append(c.getNumber())
                    .append("\t Serviceability: ")
                    .append(c.getServiceability());
        }

        return stringBuilder.toString();
    }
}
