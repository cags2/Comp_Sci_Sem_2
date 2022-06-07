import java.util.Scanner;
import java.util.Random;

class starter {
	public void toStringArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public double getArrayAverage(int[] array) {
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		return (double)sum / array.length;
	
	}
	public int getArrayMax(int[] array) {
		int max = 0;
		
	}
	public static void main(String args[]) {
		
Random a = new Random();
int [] yes = new int [a.nextInt(100) + 1];

		
	}
}
