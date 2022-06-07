import pkg.*;
import java.util.*;

class starter {
	public static void recurPower(int base, int n){
	if(n == 1){
		return base;
	}
	return base * recurPower(base, n-1);
	}	

	public static void main(String args[]) {
		
	}
}
