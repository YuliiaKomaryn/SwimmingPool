package stuff;

import java.util.Date;

public final class Pass {
    private final Date expireDate;
    private final double price;

    public Pass(Date expireDate, double price){
        this.expireDate = expireDate;
        this.price = price;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "price=" + price +
                ", expireDate='" + expireDate +
                '}';
    }
}
