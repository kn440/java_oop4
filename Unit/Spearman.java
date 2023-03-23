package Unit;

import java.util.ArrayList;

public class Spearman extends Warrior{

    public Spearman(String info,String name,int x, int y) {
        super(info,name, 100, 100, 10, 2, "Stand", x,y,30);
    }

   

    @Override
    public String getInfo() {
        info="Копейщик";
        System.out.println(info);
        return info;
    }



    @Override
    public void step(ArrayList<BaseUnit> team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }
}
