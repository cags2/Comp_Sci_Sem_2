import pkg.*;
import java.util.*;

class starter {
	public static void bubbleSort(ArrayList<Integer> art) {
		boolean sorted = false;
		while(!sorted){
			sorted = true;
			for(int i = 0 ; i < art.size()-1; i++){
				if(art.get(i) > art.get(i+1)){
					sorted = false;
					int temp = art.get(i);
					art.remove(i);
					art.add(temp, i + 1);
				}
			}
		}
	}
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		bubbleSort(arr1);			//Create this method
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
