//What Each Type of Plant is resistent to
public enum Ability {
    /*
    Cold = Tuber
    Bugs = Capsica
    */
    COLD("Cold"), BUG("Bugs");
    final String name;
    
    //constructor
    private Ability(String name){
        this.name = name;
    }
    
    //return name
    public String getName(){
        return name;
    }
}
