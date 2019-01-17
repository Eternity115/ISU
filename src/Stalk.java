//corn
public class Stalk extends PPlant{

    protected Ability res;
    
    public Stalk() {
        super(Type.STALK, 12, 20);
        res= Ability.COLD;
    }
    
    public Stalk(double c, int gr, Ability r) {
        super(Type.STALK, c, gr);
        res=r;
    }
    
    @Override
    void grow() {
        if (growth<=0){
            growth=0;
            return;
        }
        growth = growth-2;
    }
    
    public String toString(){
        String str="Corn";
        return str;
    }
    
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.STALK.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth());
        str+= "\nResisentance Type: " + Ability.DISEASE.getName();
        return str;
    }
}
