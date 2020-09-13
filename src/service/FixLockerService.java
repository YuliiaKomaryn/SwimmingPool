package service;

import java.util.LinkedList;

import model.Locker;

public final class FixLockerService {
    private LinkedList<Locker> lockers = new LinkedList<>();

    public void addLocker(int number,
                          boolean serviceability) {

        Locker tempLocker = new Locker(number, serviceability);
        lockers.add(tempLocker);
    }

    public void fixLocker(LinkedList<Locker> lockers) {
        for (Locker locker : lockers) {
            if (!locker.getServiceability()) {
                locker.setServiceability(true);
            }
        }
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
