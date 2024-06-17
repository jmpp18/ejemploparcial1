package com.mycompany.sportscenter.scenario;

import com.mycompany.sportscenter.typeSport.TypeSport;

public class Scenario {
    private int capacity;
    private TypeSport typeSport;
    private String schedule;
    private boolean available;

    public Scenario(int capacity, TypeSport typeSport, String schedule) {
        this.capacity = capacity;
        this.typeSport = typeSport;
        this.schedule = schedule;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
}
