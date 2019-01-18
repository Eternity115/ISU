//regular Potato
public class Tuber extends PPlant{
    
    protected Ability res;
    
    public Tuber() {
        super(Type.TUBER, 5, 10);
        res= Ability.COLD;
    }
    
    public Tuber(double c, int gr, Ability r) {
        super(Type.TUBER, c, gr);
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
    
    public String toString(){
        String str="Potato";
        return str;
    }
    
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.TUBER.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth());
        str+= "\nResisentance Type: " + Ability.COLD.getName() ;
        return str;
    }
    
}
