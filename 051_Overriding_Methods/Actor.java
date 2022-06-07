public class Actor extends Performer{
    String type;
    public Actor(){
        type = "Theater";
    }
    public Actor(String name, String type){
        super(name);
        type = this.type;
    }
    public void practice(){
        System.out.println(name + " is practicing for a whole 3 hour straight");
    }
    public void perform(){
        System.out.println(name + " did a really good job on performing");
    }
    public void monologue(){
        System.out.println("God respects me when I work, but he loves me when I sing");
    }
}