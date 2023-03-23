package Unit;

import java.util.ArrayList;

public class Sniper extends Scooter {

    public Sniper(String info,String name, int x, int y) {
        super(info,name, 100, 100, 1, 3, "Stand", x,y,50, 5);

    }

    

    @Override
    public String getInfo() {
        info="Снайпер";
        System.out.println(info);
        return info;
    }



    @Override
    public void step(ArrayList<BaseUnit> team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }
    
}
    
