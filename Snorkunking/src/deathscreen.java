import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class deathscreen {

	public static int deathscreens(int stageNumber, int[] point) {
		
		if (stageNumber != 3) {
		 StdDraw.picture(75, 50, "Bullesdeau.jpg", 155, 150);
         Font font = new Font("Arial", Font.BOLD, 50);
         StdDraw.setFont(font);
         StdDraw.setPenColor(StdDraw.BOOK_RED);
         StdDraw.text(75, 50, "Vous êtes morts");
         StdDraw.show();
         StdDraw.setFont();
		}
		
		if (stageNumber == 3) {
			
			StdDraw.picture(70, 50, "Bullesdeau.jpg", 150, 150);
            Font font = new Font("Arial", Font.BOLD, 50);
            StdDraw.setFont(font);
            StdDraw.text(75, 85, "Scores");
            StdDraw.setFont();
            StdDraw.text(17, 60, "Joueur 1");
            StdDraw.text(130, 60, "" + point[0]);
            StdDraw.text(17, 45, "Joueur 2");
            StdDraw.text(130, 45, "" + point[1]);
            StdDraw.text(17, 30, "Joueur 3");
            StdDraw.text(130, 30, "" + point[2]);
            StdDraw.text(17, 15, "Joueur 4");
            StdDraw.text(130, 15, "" + point[3]);
            StdDraw.show();
        }
		
         return 0;
	}
}
