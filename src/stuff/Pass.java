package stuff;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;

public final class Pass {
    //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public final Date expireDate;
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
