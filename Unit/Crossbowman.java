package Unit;

import java.util.ArrayList;
import java.util.Collections;

public class Crossbowman extends Scooter {

    public Crossbowman(String info,String name, int x, int y) {
        super(info,name, 100, 100, 2, 6, "Stand", x,y,10, 100);
        
    }
    
  
    @Override
    public String getInfo() {
        info="Арбалетчик";
        System.out.println(info);
        return info;
    }


    @Override
    public void step(ArrayList<BaseUnit> team) {
        System.out.println(team);
        if (!state.equals("Die") && number_shells!=0) return; 
        

    }


    public static Double getDistance(ArrayList<BaseUnit> list) {
    }

}
