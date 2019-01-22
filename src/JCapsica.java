
public class JCapsica extends Capsica{
    private double bonus; //bonus amount of money you get when you sell
    
    //constructor
    public JCapsica() {
        super();
        bonus=1.5;
    }
    
    //constructor
    public JCapsica(double c, int gr, Ability r, double bon) {
        super(c, gr,r);
        bonus=bon;
    }
    
    //returns name
    public String toString(){
        String str="Jalapeño";
        return str;
    }
    
    //Exclusive Method, returns bonus
    public double getBonus(){
        return bonus;
    }
    
    //adds to status method
    public String Status(){
        String str= super.Status();
        str+= "\nPlant Bonus: " + bonus;
        return str;
    }
    
}
