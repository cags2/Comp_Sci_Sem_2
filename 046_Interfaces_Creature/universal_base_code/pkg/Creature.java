package pkg;
public interface Creature{
    public boolean isDead();
    public boolean takeDamage(int);
    public String getName();
    public void attack(Role);
    public int getHealth();
}