import java.util.Random;
public class Dog {
    private String name;
    private int age;
    private String breed;
    public Dog(){
        name = ("Clifford");
        age = 3;
        breed = ("Big red dog");
    }
    public Dog(String input){
        name = input;
        age = 1;
        breed = ("dog dog");
    }
    public Dog(String name, String breed){
        this.name = name; //"this" refers to the parameter given in the method/constructor declaration, this.x = x is used when both the input and the global variable are the same name
        this.breed = breed;
        age = 1;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        breed = ("dog dog");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getBreed(){
        return breed;
    }
    public boolean isSleeping(){
       Random rand = new Random();
       int bob = rand.nextInt(2);
       if(bob == 0){
           return true;
       }
       else{
           return false;
       }
    }
    public void bark(){
        System.out.println(name + " is barking");
    }
}