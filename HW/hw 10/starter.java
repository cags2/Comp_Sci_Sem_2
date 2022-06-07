import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random a = new Random();
	int counter = 0;
	int[] array = new int [20];
int b = a.nextInt(10) + 1;
for(int i =0; i < array.length; i++){
	array[i] = a.nextInt(10) + 1;
	if(b == array[i]){
		System.out.print(array[i] + " ");
	System.out.println(i+" ");
	counter++;
	}
}
System.out.println("The total duplicates " + counter);
counter=0;
for(int c = 0; c < array.length-1; c++){
if	(array[c] == array[c + 1]){
	System.out.print(c+",");
	System.out.println(c+1);
	counter++;
}
	
}

	System.out.print("consecutive duplicates are " + counter);
		
	}
}
