package clients_services;

import java.util.LinkedList;

import stuff.Pass;

import java.util.LinkedList;

public class PassSelling {
    final static private LinkedList<Pass>  passes = new LinkedList<>();


    public void addPass(Pass pass){
        passes.add(pass);
    }

    public static void printPasses()
    {
        System.out.println("\tPasses: " );
        for (int i = 0; i < passes.size(); i++)
            System.out.println("\t" + passes.get(i));
    }
}
