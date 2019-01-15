//corn
public class Stalk extends PPlant{
    protected int age=0; //how many days you have had plant
    protected Ability res;
    
    public Stalk() {
        super(Type.STALK, 5, 10);
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
        String str= super.toString();
        str+= "Type: " + Type.STALK.getName();
        str+= "Days Until Harvestable: " + (getGrowth()-age);
        str+= "Resisentance Type: " + Ability.DISEASE.getName();
        return str;
    }
}
