import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class deathscreen {

	public static int deathscreens() {
		
		 StdDraw.picture(75, 50, "Bullesdeau.jpg", 155, 150);
         Font font = new Font("Arial", Font.BOLD, 50);
         StdDraw.setFont(font);
         StdDraw.setPenColor(StdDraw.BOOK_RED);
         StdDraw.text(75, 50, "Vous êtes morts");
         StdDraw.show();
         StdDraw.setFont();
         
         return 0;
	}
}
