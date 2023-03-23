package Unit;

import java.util.ArrayList;

public class Robber extends RobberBase{

    public Robber(String info,String name,int x, int y) {

        super(info, name, 1, 100, 2, 4, "Stand",x,y, 4, 200);
    }
  
   @Override
   public String getInfo() {
    info="Вор";
    System.out.println(info);
    return info;
   }

@Override
public void step(ArrayList<BaseUnit> team) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'step'");
}
}
