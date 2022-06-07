import java.util.Scanner;
import java.util.Random;


class starter {
	public static void meow(){
		Cat a = new Cat();
		System.out.print(a.name + " is meowing");
	}
	public static void main(String args[]) {
	Cat b = new Cat();
	Cat c = new Cat("Chris");
	
	System.out.print(b.name + " is meowing at " + c.name);

		
	}
}
