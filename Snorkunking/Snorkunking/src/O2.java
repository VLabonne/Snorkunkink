// class inutile
import edu.princeton.cs.introcs.StdDraw;

public class O2 {

	public static boolean o2(int oxygene){
		
		StdDraw.picture(117, 50, "Background.jpg", 250, 125);
		
		StdDraw.setPenColor(StdDraw.CYAN);
		StdDraw.filledRectangle(80, 90, 35 - oxygene, 2);
		
		
		return true;
	}
}
