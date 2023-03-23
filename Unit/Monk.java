package Unit;

import java.util.ArrayList;

public class Monk extends MagicMan {

    public Monk(String info,String name,int x, int y){
        super(info, name, 10, 100, 1, 5, "Stand", x,y,20 );
        
    }

   
        
    @Override
    public String getInfo() {
        info="Монах";
        System.out.println(info);
        return info;
    }



    @Override
    public void step(ArrayList<BaseUnit> team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }
} 

