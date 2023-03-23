package Unit;

import java.util.ArrayList;

public class Farmer extends FarmerBase{

    public Farmer(String info,String name, int x, int y) {
    
        super (info,name, 100, 100, 10, 5, "Stand", x, y, 10, 1000);
    }

    @Override
    public void step(ArrayList<BaseUnit> team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }
    
}