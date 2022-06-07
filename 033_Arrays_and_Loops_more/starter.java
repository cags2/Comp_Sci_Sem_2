import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random a = new Random();
	int [] yes = new int[a.nextInt(147) + 54];
    int b = a.nextInt(100) + 1;
    for(int i=0;i<yes.length; i++){
    	yes[i] = a.nextInt(100) + 1;
    }
    int compare = yes[0];
    int contrast = yes[0];
    float sum = yes[0];
for(int i = 1; i < yes.length; i++){
	if(compare>yes[i]) {
		compare = yes[i];
	}
	if(contrast < yes[i]){
		contrast = yes[i];
	}
	
	sum += yes[i];
	
}
sum /= yes.length;
System.out.println(compare);
System.out.println(contrast);	
System.out.println(sum);
System.out.println(yes.length);
	}
}
