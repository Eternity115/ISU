//Sweet Potato
public class SPTuber extends Tuber{
    private double bonus; //bonus amount of money you get when you sell
    
    public SPTuber() {
        super();
        res=Ability.COLD;
        bonus=2;
    }
    
    public SPTuber(double c, int gr, Ability r, double bon) {
        super(c, gr,r);
        bonus=bon;
    }
    
    public String toString(){
        String str="Sweet Potato";
        return str;
    }
    
    public String Status(){
        String str= super.Status();
        str+= "\nPlant Bonus: " + bonus;
        return str;
    }
    
}
