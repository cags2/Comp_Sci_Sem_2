import java.util.Scanner;
class starter {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Give a number with a decimal for x ");
	double a = input.nextDouble();
	System.out.print("Give another number with a decimal for y ");
	double b = input.nextDouble();
	System.out.println(Math.max(a,b));
	System.out.println(Math.sqrt(b));
	System.out.println(Math.pow(a,b));
	}
}
