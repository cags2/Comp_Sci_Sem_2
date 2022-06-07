import pkg.*;
import java.util.*;


class starter {
	public static void Selectionsort(ArrayList<Integer> yes){
		int outer, inner, min_index;
		for(outer = 0; outer < yes.size(); outer++){
			min_index = outer;
			for(inner = outer+1; inner < yes.size(); inner++){
				if(yes.get(inner) < yes.get(min_index)){
					min_index = inner;
				}
			}
			int temp = yes.get(outer);
			yes.remove(outer);
			yes.add(yes.get(min_index-1), outer);
			yes.remove(min_index);
			yes.add(temp, min_index);
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = 0; i < 100; i++){
			a.add(rand.nextInt(100));
		}
		Selectionsort(a);
		System.out.println(" ");
			for(Integer i : a){
			System.out.print(i + ",");
		}
		

		
	}
}
