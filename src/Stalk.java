//corn
public class Stalk extends PPlant{
    protected int age=0; //how many days you have had plant
    protected Ability res;
    
    public Stalk() {
        super(Type.STALK, 8, 12);
        res= Ability.COLD;
    }
    
    public Stalk(double c, int gr, Ability r) {
        super(Type.STALK, c, gr);
        res=r;
    }
    
    @Override
    void grow() {
        age+=1;
    }
    
    public String toString(){
        String str="Corn";
        return str;
    }
    
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.STALK.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth()-age);
        str+= "\nResisentance Type: " + Ability.DISEASE.getName();
        return str;
    }
}
