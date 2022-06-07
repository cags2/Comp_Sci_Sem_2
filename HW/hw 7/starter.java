
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog a = new Dog("chris");
		Dog b = new Dog("micah", "golden retriever");
		a.setAge(3);
		b.setAge(4);
if(!a.isSleeping()){
	a.bark();
	b.bark();
}
else {
	System.out.println("sleep gdogd");
}
}

		
	}

