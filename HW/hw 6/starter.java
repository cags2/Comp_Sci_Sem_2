import java.util.Scanner;
import java.util.Random;


class starter {
static boolean isPrime(int n){
	for(int m = 2; m < n; m++){
	if(n % m == 0){
		
		return false;
	}	
	}
	
	return true;
}
    public static void main(String args[])
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Put in a number to check if it is a prime number or not ");
    	int a = input.nextInt();
   
    	
    	if (isPrime(a) == true){
    	System.out.print("It is a prime number");
    	}
    	else{
    		System.out.print("It is not a prime number");
    	}
}
}
	

