//regular Potato
public class Tuber extends PPlant{
    protected int age=0; //how many days you have had plant
    protected Ability res;
    protected String name= "Potato";
    
    public Tuber() {
        super(Type.TUBER, 5, 10);
        res= Ability.COLD;
    }
    
    public Tuber(double c, int gr, Ability r) {
        super(Type.TUBER, c, gr);
        res=r;
    }
    public String getSName(){
        return name;
    }
    
    @Override
    void grow() {
        age+=1;
    }
    
    public String toString(){
        String str="Potato";
        return str;
    }
    
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.TUBER.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth()-age);
        str+= "\nResisentance Type: " + Ability.COLD.getName() ;
        return str;
    }
    
}
