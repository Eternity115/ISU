//Bell Pepper
public class Capsica extends PPlant{
    protected Ability res; //When Bugs attack, plant will be okay
    
    //constructor
    public Capsica() {
        super(Type.CAPSICA, 8, 12);
        res= Ability.BUG;
    }
    
    //constructor
    public Capsica(double c, int gr, Ability r) {
        super(Type.CAPSICA, c, gr);
        res=r;
    }
    
    @Override //grow plant by a day unless plant is mature
    void grow() {
        if (growth<=0){
            growth=0;
            return;
        }
        growth = growth-1;
    }
    
    //Exclusive method, return resistence
    public Ability getRes(){
        return res;
    }
    
    //returns name
    public String toString(){
        String str="Pepper";
        return str;
    }
    
    //adds to staus method
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.CAPSICA.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth());
        str+= "\nResisentance Type: " + Ability.BUG.getName() ;
        return str;
    }
}
