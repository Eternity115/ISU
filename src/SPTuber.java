//Sweet Potato
public class SPTuber extends Tuber{
    private double bonus; //bonus amount of money you get when you sell
    
    //constructor
    public SPTuber() {
        super();
        bonus=1.25;
    }
    
    //constructor
    public SPTuber(double c, int gr, Ability r, double bon) {
        super(c, gr,r);
        bonus=bon;
    }
    
    //returns name
    public String toString(){
        String str="Sweet Potato";
        return str;
    }
    
    //Exclusive method, returns bonus
    public double getBonus(){
        return bonus;
    }
    
    //added content to status
    public String Status(){
        String str= super.Status();
        str+= "\nPlant Bonus: " + bonus;
        return str;
    }
    
}
