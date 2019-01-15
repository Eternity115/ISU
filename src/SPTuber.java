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
        String str= super.toString();
        str+= "Plant Bonus: " + bonus;
        return str;
    }
    
}
