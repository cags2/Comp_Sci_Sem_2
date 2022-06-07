public class myCharacter{
    private String role;
    private int Strength;
    private int Dexterity;
    private int Intelligence;
    private int Constitution;
    private int Charisma;
    public myCharacter(){
        role = ("No role");
        Dexterity = 0;
        Strength = 0;
        Intelligence = 0;
        Constitution = 0;
        Charisma = 0;
    }
     public myCharacter(String role, int Strength, int Intelligence, int Dexterity, int Constitution, int Charisma){
         this.role = role;
         this.Strength = Strength;
         this.Intelligence = Intelligence;
         this.Dexterity = Dexterity;
         this.Constitution = Constitution;
         this.Charisma = Charisma;
     }
     public void setRole(String role){
         this.role = role;
     }
     public void setStrength(int Strength){
         this.Strength = Strength;
     }
     public void setDexterity(int Dexterity){
         this.Dexterity = Dexterity;
     }
     public void setIntelligence(int Intelligence){
         this.Intelligence = Intelligence;
     }
     public void setConstitution(int Constitution){
         this.Constitution = Constitution;
     }
     public void setCharisma(int Charisma){
         this.Charisma = Charisma;
     }
     public boolean setAll(String role, int Strength, int Intelligence, int Dexterity, int Constitution, int Charisma){
          this.role = role;
         this.Strength = Strength;
         this.Intelligence = Intelligence;
         this.Dexterity = Dexterity;
         this.Constitution = Constitution;
         this.Charisma = Charisma;
         return true;
     }
     public String getRole(){
         return role;
     }
     public int getStrength(){
         return Strength;
     }
     public int getDexterity(){
         return Dexterity;
     }
     public int getIntelligence(){
         return Intelligence;
     }
     public int getConstitution(){
         return Constitution;
     }
     public int getCharisma(){
         return Charisma;
     }
}