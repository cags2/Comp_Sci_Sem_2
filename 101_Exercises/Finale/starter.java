import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getMode(int a[]) {
      int value = 0, count = 0, i, j;

      for(i = 0; i < a.length; i++) {
         int counter = 1;
         for(j = 0; j < a.length; j++) {
            if(a[j] == a[i])
            counter++;
         }

         if(counter > count) {
            count = counter;
            value = a[i];
         }
    
      }
        if(value <= 1){
            int d = -1;
         	return d;
         } 
      return value;
	}
	
	 public static int getMedian(int a[]){
	    int median = a[a.length/2];
	    return median;
	 }
	public static void main(String args[]) {
		int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
		int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		int mode1 = getMode(arr1);
		int mode2 = getMode(arr2);
		int mode3 = getMode(arr3);
		
		int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int [ ] arr5 = {1, 2, 3, 4, 5, 6};
		int median1 = getMedian(arr4);
		int median2 = getMedian(arr5);




	}
	}
