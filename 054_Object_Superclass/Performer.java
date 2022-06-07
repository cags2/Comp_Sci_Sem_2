
public class Performer{
    String name;
    int age;
    public Performer(){
        name = "Doja Cat";
        age = 26;
    }
    public Performer(String name){
        name = this.name;
        age = 26;
    }
    public Performer(String name, int age){
        name = this.name;
        age = this.age;
    }
    public String getName(){
        return name;
    }
    public void practice(){
        System.out.println(name + " is practicing");
    }
    public void perform(){
        System.out.println(name + " is performing");
    }
    public void toString(Object yes){
        System.out.println("The performers name is " + name + " and the person is " + age);
    }
    public boolean equals(Object equal){
        if(!(equal instanceof Performer)){
            return false;
        }
        else{
            return this.name == equal.name;
        }
    }
}