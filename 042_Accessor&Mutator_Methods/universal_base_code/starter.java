import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dwarf[] a = new Dwarf[100];
		Random b = new Random();
		String[] names = {"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"};
		for(int i = 0; i < a.length; i++){
			a[i] = new Dwarf(names[b.nextInt(names.length)],b.nextInt((100) + 1));
		}
		for(int g = 0; g < a.length; g++){
			System.out.println(a[g].getName());
			System.out.println(a[g].getAge());
		}

		
	}
}
