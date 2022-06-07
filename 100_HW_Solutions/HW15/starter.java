import pkg.*;
import java.lang.Math;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("How many special squares do you want?");
		int all = a.nextInt();
		int counter = 0;
		int d = 0;
	while(true) {
		if((d % Math.sqrt(d)) == 0) {
				    	int c = 0;
				    	int count = 0;
						while(count<d) {
				    	count+=c;
				    	c++;
				    }
				    if(count == d) {
				      System.out.println(count);
				      counter++;            
				    }
				    if(counter==all) {break;}
  	}
  d++;
	}
	}
}
