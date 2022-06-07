package pkg;
import java.util.Random;
public class Rogue implements Role{
    String name;
    int health;
    int attack;
    Random a = new Random();
    
    public Rogue(){
        name = "None";
        health = a.nextInt(15) + 1;
        attack = a.nextInt(15) + 1;
    }
    public Rogue(String name){
        name = this.name;
        health = a.nextInt(15) + 1;
        attack = a.nextInt(15) + 1;
    }
    public void setHealth(int health){
        health = this.health;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
    public void attack(Warrior w){
        int roll = a.nextInt(attack)+1;
        health -= roll;
        int yami = w.getHealth() - attack;
        w.setHealth(yami);
    }
    public void attack(Wizard v){
        int roll = a.nextInt(attack)+1;
        health -= roll;
        int yami = v.getHealth() - attack;
        v.setHealth(yami);
    }
    
}