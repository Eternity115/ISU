
abstract public class PPlant {
    protected double cost; //cost to buy plant
    protected Type type; //Enum class
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
    
    //Lessens the amount of days until plant is fully grown
    abstract void grow();
    
    //returns growth
    public final int getGrowth(){
        return growth;
    }
    
    //returns cost
    public final double getCost(){
        return cost;
    }
    
    //returns day
    public static int getDay(){
        return daynum;
    }
    
    //returns money
    public static double getMoney(){
        return money;
    }
    
    //next day
    public static void addDay(){
        daynum+=1;
    }
    
    //lowers money when something is bought
    public static void decrease(double mon){
        money = money-mon;
    }
    
    //increases money when something is bought
    public static void increase(double rev){
        money = money+rev;
    }
    
    //Displays plant information
    public String Status(){
        String str= "Status Update\n";
        return str;
    }
    
    
    
}
