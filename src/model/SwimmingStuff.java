package model;

public final class SwimmingStuff {
    private final String type;
    private final int price;

    public SwimmingStuff(String type,
                         int price){
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SwimmingStuff{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
