package service;

import java.time.LocalDate;
import java.util.LinkedList;

import model.Client;
import model.Locker;

public final class FixLockerService {
    private final LinkedList<Locker> lockers = new LinkedList<>();

    public Locker addLocker(int number,
                               boolean serviceability) {

        Locker tempLocker = new Locker(number, serviceability);
        lockers.add(tempLocker);

        return tempLocker;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\tLockers: ");
        for (Locker c : lockers) {
            stringBuilder.append("\n\tnumber: ")
                    .append(c.getNumber())
                    .append("\t Serviceability: ")
                    .append(c.getServiceability());
        }

        return stringBuilder.toString();
    }
}
