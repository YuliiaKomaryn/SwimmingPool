package service;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;

import model.Pass;

public final class PurchaseService {
    private final LinkedList<Pass> passes = new LinkedList<>();

    public Pass addPass(String type,
                        int price,
                        LocalDate expireDate) {

        Pass tempPass = new Pass(type, price, expireDate);
        passes.add(tempPass);

        return tempPass;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Passes: ");
        for (Pass c : passes) {
            stringBuilder.append("\n\tType: ")
                    .append(c.getType())
                    .append("\t Price: ")
                    .append(c.getPrice());
        }
        return stringBuilder.toString();
    }

}
