//regular Potato
public class Tuber extends PPlant{
    protected int age=0; //how many days you have had plant
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
        age+=1;
    }
    
    public String toString(){
        String str= super.toString();
        str+= "Type: " + Type.TUBER.getName();
        str+= "Days Until Harvestable: " + (getGrowth()-age);
        str+= "Resisentance Type: " + Ability.COLD.getName() ;
        return str;
    }
    
}
