import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random input = new Random();
		int z = 1;
		double x = 2.5;
		double m = 14;
		int a = input.nextInt(10);
		System.out.println(a);
		int b = input.nextInt(101) + 1;
		System.out.println(b);
		Double c = input.nextDouble() + 2.5;
		System.out.println(c);
		Double d = input.nextDouble() + input.nextInt(575) + 14;
		System.out.println(d);
	}
}
