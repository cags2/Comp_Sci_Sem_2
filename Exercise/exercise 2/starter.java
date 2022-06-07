import java.util.Scanner;
import java.util.Random;

class starter {
	public static int fact(int y);
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int x = y-1;
		while(true)
		{
			System.out.println(y);
			y = y * x;
			if(x == 1)
			{
				return;
			}
			x = x-1;
		}



		
	}
}
