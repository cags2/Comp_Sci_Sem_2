import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number guessing game!!! Guess a number between 1-100 ");
		int a = input.nextInt();
		int b = 63;
		if(a < b){
			System.out.print("You are too low try again ");
		}
		else if(a == b){
			System.out.print("You are correct great job!!! ");
		}
		else if(a > b){
			System.out.print("You are too high try again ");
		}
	}
}
