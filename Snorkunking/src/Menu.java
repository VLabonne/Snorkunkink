import edu.princeton.cs.introcs.StdDraw;

import java.awt.event.*;

public class Menu{
	
public static boolean[] menu() {
		
		final int X_MAX=150;
		final int Y_MAX=100;
		final float WIDTH=0.5f;
		
		StdDraw.setXscale(-WIDTH, X_MAX+WIDTH);
		StdDraw.setYscale(-WIDTH, Y_MAX+WIDTH);
		
		StdDraw.picture(117, 50, "Snorkunknig.jpg", 250, 125);
		//System.out.println(KeyEvent.KEY_PRESSED );
		
		double Y = StdDraw.mouseY();
		double X = StdDraw.mouseX();
		boolean []cond = new boolean [2];
		
		if(StdDraw.isMousePressed() == true && (X>=3 && X<=53) && (Y>=1 && Y<=5) ) {
			//oxygene++;
				//System.out.println(oxygene);*/
			cond[0] = true;
			cond[1] = false;
			return cond;
		}
		
		if(StdDraw.isMousePressed() == true && (X>=110 && X<=145) && (Y>=1 && Y<=5) ) {
			//oxygene++;
				//System.out.println(oxygene);*/
			cond[0] = true;
			cond[1] = true;
			return cond;
		}
		else {
			cond[0] = false;
			cond[1] = false;
			return cond;
			}
	}
}
