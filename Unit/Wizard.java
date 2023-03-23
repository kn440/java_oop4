package Unit;

import java.util.ArrayList;

public class Wizard extends MagicMan{

    public Wizard(String info,String name,int x, int y) {
        super(info, name, 10, 100, 1, 1, "Stand",x,y, 30);
        
    }
    

    @Override
    public String getInfo() {
        info="Маг";
        System.out.println(info);
        return info;
    }


    @Override
    public void step(ArrayList<BaseUnit> team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }
    
}

