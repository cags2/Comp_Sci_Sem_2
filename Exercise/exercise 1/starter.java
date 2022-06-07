import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Put in a integer ");
		int a = input.nextInt();
		int b = a+4;
		while(a <= b)
		{
			System.out.println(a);
			a++;
		}

		
	}
}
