public class Banker {
    private String name;

    public Banker(String name){
        this.name=name;

    }

    public String greet(){
        return "default greet";
    }
}

class SBIBank extends Banker{
    public SBIBank(){
        super("SBIBank");
    }
}
