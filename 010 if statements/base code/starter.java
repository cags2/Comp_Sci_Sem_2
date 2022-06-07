import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Give a number ");
	int a = input.nextInt();
	System.out.print("Give another number ");
	int b = input.nextInt();
	if(a<b){
		System.out.print(a + " is less than " + b);
	}
	else if(a>b){
		System.out.print(a + " is greater than " + b);
	}
	else if(a==b){
		System.out.print(a + " is equal to " + b);
	}
	}
	}

