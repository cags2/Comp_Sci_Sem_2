import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("What do you want your name to be? only letters ");
	String c = input.nextLine();
	System.out.print("What would you want your title to be? only letters ");
	String b = input.nextLine();
	System.out.print("Do you want to be a Rogue, Wizard, or Warrior? ");
	String a = input.nextLine();
	if(a.equals("Rogue")){
		System.out.println("You are now a Rogue!");
	}
	else if(a.equals("Wizard")){
		System.out.println("You are now a Wizard!");
	}
	else if(a.equals("Warrior")){
		System.out.println("You are now a Warrior");
	}
	else if(a.equals("rogue")){
		System.out.println("You are now a Rogue!");
	}
	else if(a.equals("wizard")){
		System.out.println("You are now a Wizard!");
	}
	else if(a.equals("Warrior")){
		System.out.println("You are now a Warrior!");
	}
		else if(a.equals("warrior")){
		System.out.println("You are now a Warrior!");
	}
	else{
		System.out.println("That is not a choice :(");
	}
	System.out.print("There is Strength, Dexterity, Intelligence, Constitution, and Charisma. What would you like to choose to upgrade? ");
	String d = input.nextLine();
	System.out.print("How many times would you like to upgrade " + d + " ? You have 25 points and you can only spend 10 points on each stat");
	int f = input.nextInt();
	int v = 25;
	int p = v - f;
	while(v > 0){
	System.out.print("You have " + p + " points left to spend!. What else would you want to spend your points on? ");
	String j = input.nextLine();
		System.out.print("How many times would you like to upgrade " + j + " ? You have 25 points and you can only spend 10 points on each stat");
		int u = input.nextInt();
	int i = p - u;
	if(v == 0){
		System.out.print("You have no more points to spend");
	}
	else if(v < 0){
		System.out.print("you can't use that much");
	}
	}
	}
}
