package model;

import java.time.LocalDate;
import java.util.Date;

public final class Pass {
    public LocalDate expireDate;
    public final String type;
    private final int price;

    public Pass(String type,
                int price,
                LocalDate expireDate) {
        this.type = type;
        this.price = price;
        this.expireDate = expireDate;
    }

    //public Date setDateByType() {

    //}

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
