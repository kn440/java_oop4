package Unit;

public abstract class Warrior extends BaseUnit{
    protected int damage; // сила удара
    public Warrior(String info,String name, float health, int max_health, int lives, int speed, String state, int x, int y, int damage) {
        super(info, name, health, max_health, lives, speed, state, x,y);
        this.damage=damage;
    }
    
    
    

    
}
