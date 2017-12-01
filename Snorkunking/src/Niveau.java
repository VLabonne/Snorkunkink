import java.util.Random;

public class Niveau {

	public static int[] niveau () {
		
		int [] values = new int [4];
		
		for(int cave = 0; cave!=3; cave++) {
			
			int b = 0;
		
			if (cave == 0) {
				b = 9;
			}
		
			if (cave == 1) {
				b = 6;
			}
		
			if (cave == 2) {
				b = 3;
			}
		
		Random rand = new Random();
		int niveau = rand.nextInt(4) + b;
		
		values[cave] = niveau;
		values[3] = 0;
		
		for(int k=0; k!=3; k++) {
			
			values[3] = values[3] + values[k];
			}
		}	
		return values;
	}
}
