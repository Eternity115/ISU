
abstract public class PPlant {
    protected double cost;
    protected int type; //number given
    protected int growth; //time in days
    static int time;
    static double money;
    
    public PPlant(){
        //carrot
        type = 1;
        cost=5;
        growth = 5; 
    }
    
    public PPlant(int t, double c, int gr){
        type = t;
        cost=c;
        growth = gr;
    }
    
    
    
    
    public final void plant(){
        //ADD PLANT TO LIST
        time+=1;
    }
    
    //***************ADD ANOTHER FINAL METHOD********************\\
    
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
    
    
    
    
}
