import java.awt.Font;
import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Main {

	public final static int X_MAX = 150;
	public final static int Y_MAX = 100;
	public final static float WIDTH = 0.5f;

	public static void main(String[] args) {
		boolean cond = false;
		boolean cond2 = false;

		StdDraw.setCanvasSize(1000, 950);

		int point[] = new int[4];
		for (int stageNumber = 1; stageNumber != 4; stageNumber++) {
			while (!cond) {
				cond = Menu.menu()[0];
				cond2 = Menu.menu()[1];
			}
		
			if (cond2 == false) {
				Game.versus(stageNumber, point);
			}
			if (cond2 == true) {
				Game.coop(stageNumber, point);
			}
			
		}
	}
}
