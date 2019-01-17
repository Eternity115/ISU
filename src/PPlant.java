
abstract public class PPlant {
    protected double cost;
    protected Type type; //Enum
    protected int growth; //time in days
    private static int daynum=1; //what day you are on
    private static double money=100;
    
    public PPlant(Type type, double c, int gr){
        this.type = type;
        cost=c;
        growth = gr;
    }
    public PPlant(){
        //makes potato
        type = Type.TUBER;
        cost=5;
        growth = 10;
    }
    
    abstract void grow();
    
    /*
    Exclusive methods 
    coldSpell();
    disSpell();
    bugSpell();
    */

    /*
    Used When:
    - planted
    - sold
    */
    public static void addDay(){
        daynum+=1;
    }
    
    public final int getGrowth(){
        return growth;
    }
    
    public static int getDay(){
        return daynum;
    }
    
    public static double getMoney(){
        return money;
    }
    
    public final double getCost(){
        return cost;
    }
    
    public static void decrease(double mon){
        money = money-mon;
    }
    
    public static void increase(double rev){
        money = money+rev;
    }
    
    public String Status(){
        String str= "Status Update\n";
        return str;
    }
    
    
    
}
