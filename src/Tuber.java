//regular Potato
public class Tuber extends PPlant{
    
    protected Ability res; //When cold weather strikes, plant will be okay
    
    //constructor
    public Tuber() {
        super(Type.TUBER, 5, 10);
        res= Ability.COLD;
    }
    
    //constructor
    public Tuber(double c, int gr, Ability r) {
        super(Type.TUBER, c, gr);
        res=r;
    }
    
    //Exclusive method
    public Ability getRes(){
        return res;
    }
    
    //ages by 1 day
    @Override
    void grow() {
        if (growth<=0){//unless plant is already mature
            growth=0;
            return;
        }
        growth = growth-1;
    }
    
    //returns name
    public String toString(){
        String str="Potato";
        return str;
    }
    
    //Plant info: Type, Age, Ability
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.TUBER.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth());
        str+= "\nResisentance Type: " + Ability.COLD.getName() ;
        return str;
    }
    
}
