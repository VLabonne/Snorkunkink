import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Main {
	
	public final static int X_MAX=150;
	public final static int Y_MAX=100;
	public final static float WIDTH=0.5f;
	
	
	public static void main(String[] args) {
		boolean cond = false;
		
		StdDraw.setCanvasSize(1000, 950);
		
		int point[] = new int [4];
		for(int k=1; k!=4; k++) {
		while (!cond) {
		cond=Menu.menu();
		}	
			double oxygene = 0;
			boolean a = false;
			int [] cave = new int [4];
			int pos = 0;
			
			cave = Niveau.niveau(a, cave);
			a = true;
				
			int coffre[] = new int[cave[3]];
			int playerTresor[] = new int [4];
			int playerCoffre[] = new int[4];
			int tresors[] = new int[cave[3]];
			tresors = Tresor.tresor(cave);
			int []tresorSvg = new int[4];
			int n=0;
			
			while(n!=cave[3]) {coffre[n]=1;n++;}
		
			while(oxygene <= 35) {
			InterfaceGraphique.IG(oxygene, cave, pos, coffre, tresorSvg, playerTresor);
			StdDraw.show(50);
			//System.out.println(oxygene);
			
			double fact = 35.0/(double)(2*cave[3]);
			
			if(StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && pos != -cave[3]) {
				pos--;
				oxygene = Oxygene.oxygene(pos, 1, oxygene, playerCoffre[0], playerTresor[0], tresorSvg[0])[0];
				tresorSvg[0] =tresorSvg[0] + (int) Oxygene.oxygene(pos, 1, oxygene, playerCoffre[0], playerTresor[0], tresorSvg[0])[1];
		}
			if(StdDraw.isKeyPressed(KeyEvent.VK_UP) && pos !=0) {
				pos++;
				oxygene = Oxygene.oxygene(pos, 2, oxygene, playerCoffre[0], playerTresor[0], tresorSvg[0])[0];
				tresorSvg[0] = tresorSvg[0] + (int) Oxygene.oxygene(pos, 2, oxygene, playerCoffre[0], playerTresor[0], tresorSvg[0])[1];
				//oxygene = oxygene + fact*Cout.cout(2, 0, pos);
				
		}
			if(StdDraw.isKeyPressed(KeyEvent.VK_ENTER) && pos != 0 && coffre[cave[3] + pos] != 0) {
				oxygene = Oxygene.oxygene(pos, 3, oxygene, playerCoffre[0], playerTresor[0], tresorSvg[0])[0];
				tresorSvg[0] = tresorSvg[0] + (int) Oxygene.oxygene(pos, 3, oxygene, playerCoffre[0], playerTresor[0], tresorSvg[0])[1];
				coffre[cave[3] + pos] = coffre[cave[3] + pos] - 1;
				playerCoffre[0] = +playerCoffre[0];
				playerTresor[0] = playerTresor[0] + tresors[cave[3] + pos];
				System.out.println(playerTresor[0]);
				System.out.println(tresorSvg[0]);
				//oxygene = oxygene + fact*Cout.cout(3, 0, pos);
				
			}
			}
			while(!(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT))){
			StdDraw.clear(StdDraw.RED);
			StdDraw.text(75, 50, "Vous êtes morts");
			StdDraw.show();
			}
			}
			
		}
			}
		//InterfaceGraphique.IG();
		
				
		/*int [] player = new int [4];
		 for(int i = 0; i<4; i++) {
		 While (oxygene!=0){
		 
	System.out.println(Coffre.coffre(1,6,6));
*/

	
	


