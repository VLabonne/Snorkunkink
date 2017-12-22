import java.util.Random;
import edu.princeton.cs.introcs.StdDraw;

public class Coffre {
	
	public static int []coffre (int []cave, int factor, int []coffre) {
		
		int n=0;
		while(n != cave[3]){
		StdDraw.picture(10, factor/2 + factor*n, "Tresor.png", 3*factor, factor);
		StdDraw.textLeft(15, factor/2 + factor*n, " x "+coffre[n]);
		n++;
		
		}
		
		return coffre;
	}
}
