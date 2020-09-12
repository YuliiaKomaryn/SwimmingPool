package clients_services;

import java.util.LinkedList;

import persons.Employee;
import stuff.Pass;

import java.util.LinkedList;

final public class PassSelling {
    final private LinkedList<Pass>  passes = new LinkedList<>();


    public void addPass(Pass pass){
        passes.add(pass);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t Passes: ");
        for(Pass c: passes){
            stringBuilder.append("\n\tType: ")
                    .append(c.getType())
                    .append("\t Price: ")
                    .append(c.getPrice());
        }
        return stringBuilder.toString();
    }

}
