import edu.princeton.cs.introcs.StdDraw;

public class InterfaceGraphique {
	

	public static boolean IG() {
		
		final int X_MAX=150;
		final int Y_MAX=100;
		final float WIDTH=0.5f;
		
			
			int coffre_svg = 0;
			int oxygene = 0;
			
			int [] cave = Niveau.niveau();
			System.out.println(cave[0]);
			System.out.println(cave[1]);
			System.out.println(cave[2]);
			
			StdDraw.setXscale(-WIDTH, X_MAX+WIDTH);
			StdDraw.setYscale(-WIDTH, Y_MAX+WIDTH);
			
			StdDraw.clear(StdDraw.BLUE);
					
			int factor = 3;
			
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.filledRectangle(X_MAX, Y_MAX, X_MAX + 1, 15);
					
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.filledRectangle(80, 90, 36, 3);
					
					StdDraw.textLeft(5, 97.5, "Score");
					StdDraw.textLeft(5, 90, "Oxygene :");
					
					for(int i=1; i!=5;i++) {
						
						StdDraw.textLeft(30*i, 97.5, "joueur " + i + " : " + coffre_svg);
					}
				
					
					StdDraw.setPenColor(StdDraw.CYAN);
					StdDraw.filledRectangle(80, 90, 35 - oxygene, 2);
					
						
					StdDraw.setPenColor(StdDraw.YELLOW);
					StdDraw.filledRectangle(75, 85 - factor*(cave[0]/2) - 1, (X_MAX/2)-1, factor*(cave[0]/2));
					StdDraw.filledRectangle(75, (85 - factor*(cave[0])-1) - factor*cave[1]/2 -1, (X_MAX/2)-1, factor*(cave[1]/2));
					StdDraw.filledRectangle(75, ((85 - factor*(cave[0]) - 1) - factor*(cave[1]) - 1) - factor*cave[2]/2 -1, (X_MAX/2)-1, factor*(cave[2]/2));
					
					return true;
	}
}
