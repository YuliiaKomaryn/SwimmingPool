package clients_services;

import java.util.LinkedList;

import stuff.Pass;

import java.util.LinkedList;

public class PassSelling {
    final private double price;
    final private LinkedList<Pass>  passes = new LinkedList<>();

    public PassSelling(double price) {
        this.price = price;
    }

    public void addPass(Pass pass){
        passes.add(pass);
    }
}
