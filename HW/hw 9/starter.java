import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random a = new Random();
	int counter = 0;
	int[] array = new int [20];
	for(int i = 0; i < array.length; i++){
		array[i] = a.nextInt(50) + 1;
System.out.println(array[i]);
	}
	System.out.println(" ");
	int [] yes = new int[20];
	for(int i = array.length - 1; i >= 0; i-- ){
		yes[counter] = array[i];
		System.out.println(yes[counter]);
		counter++;
	}
	}
}
