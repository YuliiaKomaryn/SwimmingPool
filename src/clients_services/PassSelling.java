package clients_services;

import stuff.Pass;

import java.util.ArrayList;

public class PassSelling {

    private final ArrayList<Pass> passList;

    public PassSelling() {
        this.passList = new ArrayList<>();
    }

    public ArrayList<Pass> getPassList() {
        return passList;
    }

    public void addProduct(Pass pass){
        passList.add(pass);
    }

    public void deleteProduct(Pass pass){
        passList.remove(pass);
    }


}
