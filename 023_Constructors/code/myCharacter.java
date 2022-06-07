public class myCharacter{
    private String role;
    public int strength;
    public  int dexterity;
    public  int intelligence;
  public  int constitution;
   public int charisma;
    public myCharacter(){
        role = "No Role";
    }
    
    
    public myCharacter(String role){
        if(role.equals("Rogue")){
            role = ("Rogue");
        }
        else if(role.equals("Wizard")){
            role = ("wizard");
        }
        else if(role.equals("Warrior")){
            role = ("warrior");
        }
        else{
            role = ("No Role");
        }
    }
    public void setRole(String role){
        System.out.print("You chose " + role); 
    }
    public String getRole(){
        return role;
    }
}