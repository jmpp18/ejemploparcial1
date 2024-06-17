package com.mycompany.sportscenter;

import com.mycompany.sportscenter.scenario.Scenario;
import com.mycompany.sportscenter.sportsCenter.SportCenter;
import com.mycompany.sportscenter.typeSport.TypeSport;

public class SportsCenter {

    public static void main(String[] args) {
        SportCenter sportCenter = new SportCenter("El campin", "Generico", "Si", "24 Horas");
        
        Scenario scenario1 = new Scenario(1800, TypeSport.SOCCER, "2 Horas");
        Scenario scenario2 = new Scenario(400, TypeSport.BASKETBALL, "2 Horas");
        
        sportCenter.addScenario(scenario1);
        sportCenter.addScenario(scenario2);
        
        sportCenter.bookScenario(scenario1);
        sportCenter.bookScenario(scenario2);
        sportCenter.bookScenario(scenario1);
    }
}