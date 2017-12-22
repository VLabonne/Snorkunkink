import java.util.Random;

public class Coffre {
	
	public static int coffre (int cave , int niveau, int defniveau) {
		
		if(cave == 3 && niveau == defniveau) {
			Random rand = new Random();
			int coffre = rand.nextInt(10) + 1;
			return coffre;
		}
		
		else {
			return 1;
		}
	}
}
