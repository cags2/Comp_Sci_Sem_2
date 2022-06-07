import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Performer a = new Performer();
		Musician b = new Musician();
		Apprentice c = new Apprentice();
		Actor d = new Actor();
		Performer[] f = new Performer[a, b, c, d];
		for(int i = 0; i < f.length; i++){
			if(Performer[i].equals(a){
				Performer[i].perform();
				Performer[i].practice();
			}
			else if(Performer[i].equals(b)){
					Performer[i].perform();
				((Performer)Performer[i]).practice();	
			}
			else if(Performer[i].equals(c)){
				Performer[i].practiceAtUniversity();
				((Musician)Performer[i]).playInstrument();
			}
			else if(Performer[i].equals(d)){
				Performer[i].monologue();
				((Performer)Performer[i]).perform();
			}
		}

		
	}
}
