
abstract public class PPlant {
    protected double cost;
    protected Type type; //Enum
    protected int growth; //time in days
    private static int time;
    private static double money;
    
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
    
    
    public static int getTime(){
        return time;
    }
    
    public static double getMoney(){
        return money;
    }
    
    public static double decrease(int mon){
        return money-mon;
    }
    
    public static double increase(int rev){
        return money+rev;
    }
    
    public String toString(){
        String str= "Status Update\n";
        return str;
    }
    
    
    
}
