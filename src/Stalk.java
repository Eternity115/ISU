//corn
public class Stalk extends PPlant{

    
    public Stalk() {
        super(Type.STALK, 12, 20);
        
    }
    
    public Stalk(double c, int gr, Ability r) {
        super(Type.STALK, c, gr);
    }
    
    @Override
    void grow() {
        if (growth<=0){
            growth=0;
            return;
        }
        growth = growth-2;
    }
    
    //exclusive method
    public void popcorn(){
        cost = cost * 2;
    }
    
    public String toString(){
        String str="Corn";
        return str;
    }
    
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.STALK.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth());
        return str;
    }
}
