package clients_services;

import persons.Admin;
import persons.Client;
import stuff.Pass;

import java.util.ArrayList;
import java.util.Optional;

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
