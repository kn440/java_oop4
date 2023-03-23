package Unit;

public abstract class MagicMan extends BaseUnit{

    protected int power; // уровень магии

    public MagicMan(String info,String name, float health, int max_health, int lives, int speed, String state, int x, int y, int power) {
        super(info, name, health, max_health, lives, speed, state, x, y);
        this.power=power;
    }
    
   

}
