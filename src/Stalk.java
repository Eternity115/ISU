//corn
public class Stalk extends PPlant{

    //constructor
    public Stalk() {
        super(Type.STALK, 12, 20);  
    }
    
    //constructor
    public Stalk(double c, int gr, Ability r) {
        super(Type.STALK, c, gr);
    }
    
    @Override //grows plant by 2 days unless plant is mature
    void grow() {
        if (growth<=0){
            growth=0;
            return;
        }
        growth = growth-2;
    }
    
    //exclusive method, money gained becomes greater
    public void popcorn(){
        cost = cost * 2;
    }
    
    //returns plant name
    public String toString(){
        String str="Corn";
        return str;
    }
    
    //adds to status method
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.STALK.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth());
        return str;
    }
}
