import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Main {
	
	public final static int X_MAX=150;
	public final static int Y_MAX=100;
	public final static float WIDTH=0.5f;
	
	public static void main(String[] args) {
		boolean cond = false;
		
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
			
			while(oxygene <= 35) {
			InterfaceGraphique.IG(oxygene, cave, pos);
			StdDraw.show(50);
			
			//System.out.println(oxygene);
			
			double fact = 35.0/(double)(2*cave[3]);
			
			if(StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && pos != -cave[3]) {
				pos--;
				oxygene = oxygene + fact*Cout.cout(1, 0, pos);
				InterfaceGraphique.IG(oxygene, cave, pos);
		}
			if(StdDraw.isKeyPressed(KeyEvent.VK_UP) && pos !=0) {
				pos++;
				oxygene = oxygene + fact*Cout.cout(2, 0, pos);
				InterfaceGraphique.IG(oxygene, cave, pos);
		}
			if(StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
				oxygene = oxygene + fact*Cout.cout(3, 0, pos);
			}
			}
			while(true){
			StdDraw.clear(StdDraw.RED);
			StdDraw.text(75, 50, "Vous êtes morts");
			StdDraw.show(5000);
		
			}
		}
			}
		//InterfaceGraphique.IG();
		
				
		/*int [] player = new int [4];
		 for(int i = 0; i<4; i++) {
		 While (oxygene!=0){
		 
	System.out.println(Coffre.coffre(1,6,6));
*/
	}
	
	


