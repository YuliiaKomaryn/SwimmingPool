package stuff;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;

public final class Pass {
    //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public final String type;
    private final int price;

    public Pass(String type, int price){
        this.type = type;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Pass{" +
                "type=" + type +
                ", price=" + price+
                '}';
    }
}
