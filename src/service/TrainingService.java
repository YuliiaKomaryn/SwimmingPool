package service;

import java.util.LinkedList;

import model.*;

public final class TrainingService {
    private final LinkedList<SwimmingPool> swimmingPools = new LinkedList<>();
    private final LinkedList<Training> trainings = new LinkedList<>();

    public SwimmingPool addSwimmingPool(String name,
                                        int width,
                                        int depth,
                                        int length,
                                        String adress) {

        SwimmingPool tempSwimmingPool = new SwimmingPool(name, width, length, depth, adress);
        swimmingPools.add(tempSwimmingPool);

        return tempSwimmingPool;
    }


    public void createTraining(Client client,
                               Pass pass,
                               Sport sport,
                               Employee employee,
                               SwimmingStuff swimmingStuff) {
        Training tempTraining = new Training(client, pass, sport, employee, swimmingStuff);
        trainings.add(tempTraining);
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
