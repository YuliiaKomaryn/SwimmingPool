package service;

import java.util.LinkedList;

import model.SwimmingPool;

public final class TrainingService {
    private final LinkedList<SwimmingPool> swimmingPools = new LinkedList<>();

    public SwimmingPool addSwimmingPool(String name,
                                        int width,
                                        int depth,
                                        int length,
                                        String adress) {

        SwimmingPool tempSwimmingPool = new SwimmingPool(name, width, length, depth, adress);
        swimmingPools.add(tempSwimmingPool);

        return tempSwimmingPool;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Swimming Pool info: ");
        for (SwimmingPool c : swimmingPools) {
            stringBuilder.append("\n\tName: ")
                    .append(c.getName())
                    .append("\t Adress: ")
                    .append(c.getAdress())
                    .append("\n\tDepth: ")
                    .append(c.getDepth())
                    .append("\tWidth: ")
                    .append(c.getWidth())
                    .append("\tLength: ")
                    .append(c.getLength());
        }
        return stringBuilder.toString();
    }

}
