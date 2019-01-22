//What type each plant is
public enum Type {
    /*
    Stalk = Corn, Tuber = Sweet Potato & Potato, Capsica = Pepper & Jalapeño
    */
    STALK("Stalk"), TUBER("Tuber"), CAPSICA("Capsica");
    final String name;
    
    //constructor
    private Type(String name){
        this.name = name;
    }
    
    //return name
    public String getName(){
        return name;
    }
}
