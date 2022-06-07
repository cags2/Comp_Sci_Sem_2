import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name? ");
		String a = input.nextLine();
		System.out.print("How many times do you want your name to printed? ");
		int b = input.nextInt();
		int c = 0 + b;
		int d = 0;
		while(d <= c){
			System.out.println(a);
			d++;
		}



		
	}
}
