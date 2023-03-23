
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Unit.BaseUnit;
import Unit.Crossbowman;
import Unit.Farmer;
import Unit.Monk;
import Unit.Names;
import Unit.Robber;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Wizard;
public class Main2 {

    public static void main(String[] args)

{
    ArrayList<BaseUnit> list = new ArrayList<>();
        ArrayList<BaseUnit> list2 = new ArrayList<>();
        ArrayList<BaseUnit> list3 = new ArrayList<>();
        

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)){  
                case 0:
                    list.add(new Farmer(null,getName(),i+1,1));
                    break;
                case 1:
                    list.add(new Wizard(null,getName(),i+1,1));
                    break;  
                case 2:
                    list.add(new Robber(null,getName(),i+1,1));
                    break; 
                default:
                    list.add(new Sniper(null,getName(),i+1,1));
                    break;
            }
            switch (new Random().nextInt(4)){
                case 0:
                    list2.add(new Crossbowman(null,getName(),i+1,10));
                    break;
                case 1:
                    list2.add(new Farmer(null,getName(),i+1,10));
                    break;
                case 2:
                    list2.add(new Spearman(null,getName(),i+1,10));
                    break;
                default:
                    list2.add(new Monk(null,getName(),i+1,10));
                    break;
            }
            System.out.println("Дистанции от лучника"); 
            Double list4 = Crossbowman.getDistance(list);
            System.out.println(list4);
        }
        System.out.println("Имена игроков list1");
        list.forEach(u->u.getNAME());
        System.out.println("Имена игроков list2");
        list2.forEach(u->u.getNAME());
        
        System.out.println("Функция GetInfo list");  
        list.forEach(u->u.getInfo()); 
        System.out.println("Функция GetInfo list2");  
        list2.forEach(u->u.getInfo()); 
        

        System.out.println("Сортировка по скорости");  
        list3.addAll(list);
        list3.addAll(list2);
        System.out.println(list3); 

        list3.sort(new Comparator<BaseUnit>(){
            @Override
            public int compare(BaseUnit u1, BaseUnit u2) 
            {
                if (u1.getSpeed()==u2.getSpeed())    
                return 0;
                else if(u1.getSpeed() > u2.getSpeed())    
                return 1;
                else return -1;
            }
        });
        System.out.println(list3); 
        

        


    }

    





private static String getName(){
    return Names.values()[new Random().nextInt(Names.values().length)].toString();
}

}

