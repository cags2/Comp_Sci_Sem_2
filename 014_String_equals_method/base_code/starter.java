import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Do you want to be a Rogue, Wizard, or Warrior? ");
	String a = input.nextLine();
	if(a.equals("Rogue")){
		System.out.print("You are now a Rogue!");
	}
	else if(a.equals("Wizard")){
		System.out.print("You are now a Wizard!");
	}
	else if(a.equals("Warrior")){
		System.out.print("You are now a Warrior");
	}
	else if(a.equals("rogue")){
		System.out.print("You are now a Rogue!");
	}
	else if(a.equals("wizard")){
		System.out.print("You are now a Wizard!");
	}
	else if(a.equals("Warrior")){
		System.out.print("You are now a Warrior!");
	}
		else if(a.equals("warrior")){
		System.out.print("You are now a Warrior!");
	}
	else{
		System.out.print("That is not a choice :(");
	}
	}
}
