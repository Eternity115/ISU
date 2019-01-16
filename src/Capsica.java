//Bell Pepper
public class Capsica extends PPlant{
    protected int age=0; //how many days you have had plant
    protected Ability res;
    
    public Capsica() {
        super(Type.CAPSICA, 5, 5);
        res= Ability.BUG;
    }
    
    public Capsica(double c, int gr, Ability r) {
        super(Type.CAPSICA, c, gr);
        res=r;
    }
    
    @Override
    void grow() {
        age+=1;
    }
    
    public String toString(){
        String str="Pepper";
        return str;
    }
    
    public String Status(){
        String str= super.Status();
        str+= "Type: " + Type.CAPSICA.getName();
        str+= "\nDays Until Harvestable: " + (getGrowth()-age);
        str+= "\nResisentance Type: " + Ability.BUG.getName() ;
        return str;
    }
}
