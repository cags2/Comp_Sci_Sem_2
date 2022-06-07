public class myCharacter{
    private String role;
    public int strength;
    public  int dexterity;
    public  int intelligence;
  public  int constitution;
   public int charisma;
    public myCharacter(){
        role = "No Role";
        dexterity = 0;
        intelligence = 0;
        strength = 0;
        constitution = 0; 
        charisma = 0;
    }
    public myCharacter(String role){
        if(role.equals("Rogue"||"rogue")){
            role = ("Rogue");
        } else if(role.equals("Wizard"||"wizard")){
            role = ("wizard");
        }
         else if(role.equals("Warrior"|| "warrior")){
            role = ("warrior");
         }private
    }
    
    public myCharacter(String role, int strength, int intelligence, int dexterity, int constitution, int charisma){
        if(role.equals("Rogue"||"rogue")){
            role = ("Rogue");
            this.strength = strength;
            this.intelligence = intelligence;
            this.dexterity = dexterity;
            this.constitution = constitution;
            this.charisma = charisma;
        }
        else if(role.equals("Wizard"||"wizard")){
            role = ("wizard");
            this.strength = strength;
            this.intelligence = intelligence;
            this.dexterity = dexterity;
            this.constitution = constitution;
            this.charisma = charisma;
        }
        else if(role.equals("Warrior"|| "warrior")){
            role = ("warrior");
            this.strength = strength;
            this.intelligence = intelligence;
            this.dexterity = dexterity;
            this.constitution = constitution;
            this.charisma = charisma;
        }
        else{
            role = ("No Role");
        }
    }
    public void setRole(String role){
        System.out.println("You chose " + role); 
        System.out.println("You have " + strength + " on strength");
        System.out.println("You have " + intelligence + " on intelligence");
        System.out.println("You have " + dexterity + " on dexterity");
        System.out.println("You have " + constitution + " on constitution");
        System.out.println("You have " + charisma + " on charisma");
    }
    public String getRole(){
        return role;
        return strength;
        return intelligence;
        return dexterity;
        return constitution;
        return charisma;
    }
}