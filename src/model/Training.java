package model;

public class Training {
    Client client;
    Pass pass;
    Sport sport;
    Employee employee;
    SwimmingStuff swimmingStuff;

    public Training(Client client,
                    Pass pass,
                    Sport sport,
                    Employee employee,
                    SwimmingStuff swimmingStuff) {
        this.client = client;
        this.pass = pass;
        this.sport = sport;
        this.employee = employee;
        this.swimmingStuff = swimmingStuff;
    }

}
