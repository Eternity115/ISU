//What Each Type of Plant is resistent to
public enum Ability {
    COLD("Cold"), DISEASE("Disease"), BUG("Bug");
    final String name;
    
    private Ability(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
