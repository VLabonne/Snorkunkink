import edu.princeton.cs.introcs.StdDraw;

import java.awt.event.*;

public class Menu{
	
public static boolean menu() {
		
		final int X_MAX=150;
		final int Y_MAX=100;
		final float WIDTH=0.5f;
		
		StdDraw.setXscale(-WIDTH, X_MAX+WIDTH);
		StdDraw.setYscale(-WIDTH, Y_MAX+WIDTH);
		
		StdDraw.picture(117, 50, "/mnt/monster/home/eleves/v/vala10893/Téléchargements/Snorkunknig.jpg", 250, 125);
		//System.out.println(KeyEvent.KEY_PRESSED );
		
		if(StdDraw.isMousePressed() == true ) {
			
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(75, 50, "bonjour");
			System.out.println(2);
		}
		return true;
	}
}
