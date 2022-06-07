import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dwarf[] a = new Dwarf[100];
		counter = 0;
		Random b = new Random();
		String[] names = {"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
		for(int i = 0; i < a.length; i++){
			Dwarf[i] = new Dwarf(names.nextLine());
			while(a[i].equals(a[0])){
			counter++;
		}
		}
		System.out.println(counter);
		
		
	}
}
