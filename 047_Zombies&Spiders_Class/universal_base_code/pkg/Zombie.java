import java.util.Random;
package pkg;
public class Zombie{
    String name;
    int health;
    int attack;
    Random a = new Random();
    public Zombie(){
        name = "Zack";
        health = a.nextInt(11) + 5;
        attack = a.nextInt(11) + 5;
    }
    public Zombie(String name){
        name = this.name;
        health = a.nextInt(11) + 5;
        attack = a.nextInt(11) + 5;
    }
    public void setName(String name){
        name = this.name;
    }
    public void setAttack(int attack){
        attack = a.nextInt(11) + 5;
    }
    public void setHealth(int health){
        health = a.nextInt(11) + 5;
    }
    public String getName(){
        return name;
    }
    public void attack(Spider){
        
    }
    
}