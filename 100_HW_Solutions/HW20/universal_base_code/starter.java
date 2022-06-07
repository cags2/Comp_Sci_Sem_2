import java.util.*;

class starter {
	public static void bubbleSortArrayList(ArrayList<Integer> list) {
	    boolean sorted = false;
	
	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < list.size()-1; i++) {
	            if (list.get(i)>list.get(i + 1)) {
	                int temp = list.get(i);
	                list.set(i, list.get(i + 1));
	                list.set(i + 1, temp);
	                sorted = false;
	            }
	        }
    	}
	}
    public static void doSelectionSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(pos))
                    pos = j;
            }
            int min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);
        }
    }
    public static void insertionSort(ArrayList<Integer> array) {  
        int n = array.size();  
        for (int j = 1; j < n; j++) {  
            int key = array.get(j);  
            int i = j-1;  
            while ( (i > -1) && ( array.get(i) > key ) ) {  
                array.set(i+1, array.get(i)); 
                i--;  
            }  
            array.set(i+1, key);  
        }  
    }  
	public static void main(String args[]) {
		Random a = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++){
		    list.add(a.nextInt(101));
		    
		}
		insertionSort(list);
		System.out.println(list);
		double median = (list.get(49) + list.get(50)) / 2;
		System.out.println(median);
	}
}
