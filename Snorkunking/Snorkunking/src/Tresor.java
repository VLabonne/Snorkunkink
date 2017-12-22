import java.util.Random;

public class Tresor {
	
	public static int[] tresor (int cave, int maxNiveau) {
		
		int [] tresors = new int [maxNiveau];
		int a = 0;
		int b = 0;
		
		if (cave == 1) {
			 a = 3;
			 b = 1;
		}
		
		if (cave == 2) {
			 a = 4;
			 b = 5;
		}
		
		if (cave == 3) {
			 a = 3;
			 b = 10;
		}
		
		for(int i=1; i==maxNiveau; i++) {
			
		Random rand = new Random();
		int tresor = rand.nextInt(a) + b;
		tresors[i] = tresor;
		}
		
		return tresors;
		
		
		

	}

}
