import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Apprentice a = new Apprentice();
		Apprentice b = new Apprentice("San Marino", 3);
		Apprentice c = new Apprentice("violin", "Hoover", 4);
		Apprentice d = new Apprentice("David", 15, "Trumpet", "St. Francis", 7);
		a.playInstrument();
		b.practice();
		c.perform();
		d.practiceAtUniversity();
		
	}
}
