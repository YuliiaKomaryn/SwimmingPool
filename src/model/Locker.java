package model;

public final class Locker {
    private final int number;
    private Boolean serviceability;

    public Locker(int number,
                  Boolean serviceability) {
        this.number = number;
        this.serviceability = serviceability;
    }

    public void setServiceability(boolean serviceability) {
        this.serviceability = serviceability;
    }

    public int getNumber() {
        return number;
    }

    public Boolean getServiceability() {
        return serviceability;
    }

    @Override
    public String toString() {
        return "Locker{" +
                "number=" + number +
                ", serviceability='" + serviceability +
                '}';
    }
}
