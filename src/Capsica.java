//Bell Pepper
public class Capsica extends PPlant{
    protected Ability res;
    
    public Capsica() {
        super(Type.CAPSICA, 8, 12);
        res= Ability.BUG;
    }
    
    public Capsica(double c, int gr, Ability r) {
        super(Type.CAPSICA, c, gr);
        res=r;
    }
    
    @Override
    void grow() {
        if (growth<=0){
            growth=0;
            return;
        }
        growth = growth-1;
    }
    
    //Exclusive method
    public Ability getRes(){
        return res;
    }
    
    public String toString(){
        String str="Pepper";
        return str;
    }
    
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.CAPSICA.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth());
        str+= "\nResisentance Type: " + Ability.BUG.getName() ;
        return str;
    }
}
