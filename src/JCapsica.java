
public class JCapsica extends Capsica{
    private double bonus; //bonus amount of money you get when you sell
    
    public JCapsica() {
        super();
        res=Ability.BUG;
        bonus=4;
    }
    
    public JCapsica(double c, int gr, Ability r, double bon) {
        super(c, gr,r);
        bonus=bon;
    }
    
    public String toString(){
        String str= super.toString();
        str+= "Plant Bonus: " + bonus;
        return str;
    }
    
}
