import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random secret = new Random();
		Scanner input = new Scanner(System.in);
		int b = secret.nextInt(100) + 1;
		System.out.print("Guess a number between 1 - 100 ");
		int a = input.nextInt();
		while(a != b){
			System.out.print("Wrong choose another number ");
			a = input.nextInt();
		}
		System.out.print("You got it correct!!!");
	



		
	}
}
