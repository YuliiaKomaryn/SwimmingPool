package service;

import java.time.LocalDate;
import java.util.LinkedList;

import model.Pass;
import model.SwimmingStuff;

public final class StuffRentService {
    private final LinkedList<SwimmingStuff> goods = new LinkedList<>();

    public SwimmingStuff addSwimmingStuff(String type,
                                          int price) {

        SwimmingStuff tempSwimmingStuff = new SwimmingStuff(type, price);
        goods.add(tempSwimmingStuff);

        return tempSwimmingStuff;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Stuff for rent: ");
        for (SwimmingStuff c : goods) {
            stringBuilder.append("\n\tType: ")
                    .append(c.getType())
                    .append("\t Price: ")
                    .append(c.getPrice());
        }
        return stringBuilder.toString();
    }

}
