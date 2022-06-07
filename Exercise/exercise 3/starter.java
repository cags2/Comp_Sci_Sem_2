import java.util.Scanner;
import java.util.Random;

class starter {
	public static int yes(int input, int input2) {
		int number = input*input2;
		if(number % 3 == 0) {
			return number;
		}
		else{return 0;}
		}
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Put in two integers ");
	int Onput = input.nextInt();
	int Onput2 = input.nextInt();
	System.out.print(yes(Onput,Onput2));
	

	}
}
