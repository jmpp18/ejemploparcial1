package com.mycompany.sportscenter.sportsCenter;

import com.mycompany.sportscenter.scenario.Scenario;
import java.util.ArrayList;
import java.util.List;

public class SportCenter {
    private String name;
    private String ID;
    private String location;
    private String schedule;
    private List<Scenario> scenarios = new ArrayList<>();

    public SportCenter(String name, String ID, String location, String schedule) {
        this.name = name;
        this.ID = ID;
        this.location = location;
        this.schedule = schedule;
    }

    public void addScenario(Scenario scenario) {
        this.scenarios.add(scenario);
    }
    
    public void bookScenario(Scenario scenario) {
        
        int index = this.scenarios.indexOf(scenario);
        Scenario sc = this.scenarios.get(index);
        
        if (sc.isAvailable() == true) {
            System.out.println("Reservado!");
            sc.setAvailable(false);
        }        
        else {
            System.out.println("Ocupado");
        }
        
    }
    
}
