import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	Random x = new Random();
	int t;
	int g = 100;
	System.out.print("Do you want to bet? You have 100 dollars. (y/Y/yes/Yes) ");
	String d = input.nextLine();
	if(d.equals("y") || d.equals("Y") || d.equals("yes") || d.equals("Yes")){
		while(g != 0){
			int a = x.nextInt(11);
	int b = x.nextInt(11);
	int c = x.nextInt(11);
		System.out.print("How much do you want to bet? ");
		t = input.nextInt();
		int p = t * 2;
		int h = t * 3;
		if(t <= g && t >= 0){
			
		if(g > 0){
			System.out.println(a + " " + b + " " + c);
			if (a == b && b == c && c == b){
				System.out.println("You tripled your money now you have " + (g + p));
				g = g + p;
			}
			else if (a == b || b == c || a == c){
				System.out.println("You doubled your money now you have " + (g + t));
				g = g + t;
			}
			else{
				System.out.println("You have lost money so now you have " + (g - t));
				g = g - t;
			}
			
		}
		}
		else if(t > g){
			System.out.println("You don't have that much money");
		}
		else if(t < 0){
			System.out.println("That is not possible");
		}
	
	}
	}
	}
}
