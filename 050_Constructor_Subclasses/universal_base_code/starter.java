import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Musician a = new Musician("Chris", "Piano");
		Musician b = new Musician("Micah", 15, "Violin");
		a.getName();
		a.practice();
		a.getInstrument();
		b.getName();
		b.perform();
		b.getInstrument();

		
	}
}
