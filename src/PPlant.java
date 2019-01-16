
abstract public class PPlant {
    protected double cost;
    protected Type type; //Enum
    protected int growth; //time in days
    private static int time;
    private static double money=100;
    
    public PPlant(Type type, double c, int gr){
        type = type;
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

    
    public final void plant(){
        //ADD PLANT TO LIST
        time+=1;
    }
    
    public final int getGrowth(){
        return growth;
    }
    
    public final void age(){
        growth = growth-1;
    }
    
    
    public static int getTime(){
        return time;
    }
    
    public static double getMoney(){
        return money;
    }
    
    public double getCost(){
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
