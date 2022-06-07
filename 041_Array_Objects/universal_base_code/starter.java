import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		Wizard[] a = new Wizard[100];
		Warrior[] b = new Warrior[100];
		int h = 0;
		int g = 0;
		for(int i = 0; i < a.length; i++){
			a[i] = new Wizard();
			b[i] = new Warrior();
		}
		while((h < 100) && (g < 100)){
			a[h].attack(b[g]);
			b[g].attack(a[h]);
			if(b[g].isDead()){
				g++;
			}
			if(a[h].isDead()){
				h++;
			}
		}
		if(h == 99){
			System.out.println("Wizard wins");
		}
		//else if(g == 99){
		else {
			System.out.println("Warrior wins");
		}
	}
}
