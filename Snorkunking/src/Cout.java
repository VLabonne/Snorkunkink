
public class Cout {
	
	public static int cout (int action, int nbrcoffre, int niveau) {
		
		if ((action == 1 || action == 2) && niveau != 0) {
			return 1 + nbrcoffre;
		}
		
		if (action == 3) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
