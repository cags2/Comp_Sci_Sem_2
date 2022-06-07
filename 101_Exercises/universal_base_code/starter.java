import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Ascii yes = new Ascii();
	yes.printArt();
Ascii i = new Ascii("Cactus");
i.printArt();
Ascii o = new Ascii("dog", "Chris");
o.printArt();
Ascii r = new Ascii("other", 2);
r.setAscii("                  ---------------+---------------\n 		            ___ /^^[___              _\n 		           /|^+----+   |#___________//\n 		         ( -+ |____|    ______-----+/\n 		          ==_________--'            \n 		            ~_|___|__");

				r.printArt();

		
	}
}
