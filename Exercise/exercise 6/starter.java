import java.util.*;


class starter {
    public static void printArrayList(ArrayList<Integer> cags){
        for(Integer i: cags){
            System.out.print(i.intValue()+" ");
        }
    }
    public static void addValuesArrayList(ArrayList<Integer> cags, int total){
        Random a = new Random();  
        for(int i = 0; i < total; i++){
            cags.add(a.nextInt(100) + 1);
        }
    }
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many values do you want to add in the array? ");
		ArrayList<Integer> arr = new ArrayList<>();
		addValuesArrayList(arr,input.nextInt());
		printArrayList(arr);
		


		
	}
}
