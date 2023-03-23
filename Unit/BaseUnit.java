package Unit;

public abstract class BaseUnit implements UnitInterface {
    
    protected String info;
    protected final String NAME;
    protected float health;	 //текущий уровень здоровья
    protected int max_health;	//максимальное значение здоровья
    protected int lives;	//количество жизней
    protected int speed;	//скорость передвижения
    protected String state;
    protected Position position;
    

    

    public BaseUnit (String info, String name, float health, int max_health, int lives, int speed, String state, int x, int y )
    {
        this.info=info;
        NAME=name;
        this.health=health;
        this.max_health=max_health;
        this.lives=lives;
        this.speed=speed;
        this.state="Stand";
        position = new Position(x,y);
        

    }
    @Override
    public void getNAME() {
        System.out.println(NAME);
    }
    
    @Override
    public String getInfo()
    {
        
        return "Описание";
    }
    
   @Override
   public int getSpeed() {
       return this.speed;
   }
}
