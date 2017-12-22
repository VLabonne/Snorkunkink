import edu.princeton.cs.introcs.StdDraw;

public class InterfaceGraphique {
	

	public static boolean IG(double oxygene, int[] cave, int pos) {
		
		final int X_MAX=150;
		final int Y_MAX=100;
		final float WIDTH=0.5f;
			
			int coffre_svg = 0;
			//cave = Niveau.niveau(a, cave);
			
			/*System.out.println(cave[0]);
			System.out.println(cave[1]);
			System.out.println(cave[2]);*/ //Debug 
			
			//StdDraw.setCanvasSize(750, 750);
			StdDraw.setXscale(0, X_MAX+WIDTH);
			StdDraw.setYscale(0, Y_MAX+WIDTH);
			
			//StdDraw.clear(StdDraw.BLUE);
		
			int factor = Math.round((Y_MAX - 15)/ cave[3]);
			
			StdDraw.picture(75, 50, "Background.jpg", 250, 125);
			StdDraw.picture(75,factor/2 + 1 + factor*cave[2] + factor*cave[1] + factor*cave[0] + pos*factor, "Sous-Marin.png", 3*factor, factor);
					
			
					//StdDraw.setPenColor(StdDraw.WHITE);
					//StdDraw.filledRectangle(X_MAX, Y_MAX, X_MAX + 1, 15);
					
					StdDraw.setPenColor(StdDraw.DARK_GRAY);
					StdDraw.filledRectangle(80, 90, 36, 3);
					
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.textLeft(5, 97.5, "Score");
					StdDraw.textLeft(5, 90, "Oxygene :");
					
					for(int i=1; i!=5;i++) {
						
						StdDraw.textLeft(30*i, 97.5, "joueur " + i + " : " + coffre_svg);
					}
				
					StdDraw.setPenColor(StdDraw.CYAN);
					StdDraw.filledRectangle(80, 90, 35 - oxygene, 2);
					
					StdDraw.setPenColor(StdDraw.WHITE);
					//StdDraw.line(0, 85-1, X_MAX, 85-1);
					StdDraw.line(0, 1 + factor*cave[2] + factor*cave[1] + factor*cave[0], X_MAX, 1 + factor*cave[2] + factor*cave[1] + factor*cave[0]);
					StdDraw.line(0, 1 + factor*cave[2] + factor*cave[1], X_MAX, 1 + factor*cave[2] + factor*cave[1]);
					StdDraw.line(0, 1 + factor*cave[2], X_MAX, 1 + factor*cave[2]);
					
					/*StdDraw.setPenColor(StdDraw.YELLOW);
					StdDraw.filledRectangle(75, 85 - factor*(cave[0]/2) - 1, (X_MAX/2)-1, factor*(cave[0]/2));
					StdDraw.filledRectangle(75, (85 - factor*(cave[0])-1) - factor*cave[1]/2 -1, (X_MAX/2)-1, factor*(cave[1]/2));
					StdDraw.filledRectangle(75, ((85 - factor*(cave[0]) - 1) - factor*(cave[1]) - 1) - factor*cave[2]/2 -1, (X_MAX/2)-1, factor*(cave[2]/2));
					*/
					
					return true;
					}
}
