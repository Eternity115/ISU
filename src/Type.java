
public enum Type {
    STALK("Stalk"), TUBER("Tuber"), CAPSICA("Capsica");
    final String name;
    
    private Type(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
