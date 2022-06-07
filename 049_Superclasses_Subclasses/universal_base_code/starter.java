import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Performer a = new Performer();
		Performer b = new Performer("Chris", 15);
		Musician c = new Musician();
		Musician d = new Musician("Piano");
		a.getName();
		a.practice();
		b.getName();
		b.practice();
		c.getName();
		c.perform();
		c.playInstrument();
		d.practice();
		d.getInstrument();
		
	}
}
