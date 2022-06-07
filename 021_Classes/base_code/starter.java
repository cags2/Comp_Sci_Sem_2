import java.util.Scanner;
import java.util.Random;
class Character{
	String classa = new String("Rogue");
	String classb = new String("Wizard");
	String classc = new String("Warrior");
	int Strength = 0;
	int Dexterity = 10;
	int Intelliegence = 15;
	int Constitution = 0;
	int Charisma = 0;
}
class starter {
	public static void main(String args[]) {
		Character mychar = new Character();
		System.out.println(mychar.classa);
		System.out.println("On intelligence You have " + mychar.Intelliegence);
		System.out.println("On Dexterity You have " + mychar.Dexterity);


		
	}
}
