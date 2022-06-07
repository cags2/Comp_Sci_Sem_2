import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give a integer ");
		int a = input.nextInt();
		System.out.print("Give another integer ");
		int b = input.nextInt();
		System.out.print("Give one more integer ");
		int c = input.nextInt();
		if((a < b) && (b < c)){
			System.out.print("The largest integer is " + c + " and the smallest integer is " + a);
			}
			else if((b < a) && (a < c)){
				System.out.print("The largest integer is " + c + " and the smallest integer is " + b);
			}
		else if((c < b) && (b < a)){
			System.out.print("The largest integer is " + a + " and the smallest integer is " + c);
		}
		else if((c < a) && (a < b)){
			System.out.print("The largest integer is " + b + " and the smallest integer is " + c);
		}
		else if((b < c) && (c < a)){
			System.out.print("The largest integer is " + a + " and the smallest integer is " + b);
		}
		else if((a < c) && (c < b)){
			System.out.print("The largest integer is " + b + " and the smallest integer is " + a);
		}
		}
		
	}
