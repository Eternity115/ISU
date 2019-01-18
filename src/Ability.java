//What Each Type of Plant is resistent to
public enum Ability {
    COLD("Cold"), BUG("Bugs");
    final String name;
    
    private Ability(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
