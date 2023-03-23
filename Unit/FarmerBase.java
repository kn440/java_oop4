package Unit;

public abstract class FarmerBase extends BaseUnit{

    protected int harvesting_speed; //скорость сбора урожая
    protected float volume_stocks; // запасы

    public FarmerBase(String info,String name, float health, int max_health, int lives, int speed, String state, int x, int y, int harvesting_speed, float volume_stocks) {
        super(info, name, health, max_health, lives, speed, state, x,y);
        this.harvesting_speed=harvesting_speed;
        this.volume_stocks=volume_stocks;
    }
    
    

}
