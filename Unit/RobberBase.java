package Unit;

public abstract class RobberBase extends BaseUnit{
    protected int amount_stolen; // сколько может всзять с крестьянина за 1 раз
    protected int max_stocks; // сколько может накопить

    public RobberBase(String info,String name, float health, int max_health, int lives, int speed, String state,int x, int y, int amount_stolen, int max_stocks) {
        super(info,name, health, max_health, lives, speed, state, x,y);
        this.amount_stolen=amount_stolen;
        this.max_stocks=max_stocks;
    }



    
    
}
